package com.gaogf.flinkapp.watermaker;

import com.gaogf.flinkapp.bean.LogEvent;
import org.apache.flink.streaming.api.functions.AssignerWithPeriodicWatermarks;
import org.apache.flink.streaming.api.watermark.Watermark;

import javax.annotation.Nullable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author gaogf
 *
 */
public class LogEventWaterMarkExtractor implements AssignerWithPeriodicWatermarks<LogEvent> {
    private ThreadLocal<SimpleDateFormat> format = new ThreadLocal<>();
    private long currentTimestamp = Long.MAX_VALUE;
    @Nullable
    @Override
    public Watermark getCurrentWatermark() {
        return new Watermark(currentTimestamp);
    }

    @Override
    public long extractTimestamp(LogEvent element, long previousElementTimestamp) {
        SimpleDateFormat simpleDateFormat = format.get();
        simpleDateFormat.applyPattern("yyyy-MM-dd HH:mm:ss.fff");
        try {
            Date date = simpleDateFormat.parse(element.getCrtTime());
            long dateTime = date.getTime();
            currentTimestamp = dateTime;
            return dateTime;
        } catch (ParseException e) {
            e.printStackTrace();
            return currentTimestamp;
        }
    }
}
