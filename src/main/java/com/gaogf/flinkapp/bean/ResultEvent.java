package com.gaogf.flinkapp.bean;

import com.gaogf.flinkapp.sink.TableResult;

import java.io.Serializable;

/**
 * @author gaogf
 */
public class ResultEvent extends TableResult implements Serializable {
    private String name;
    private Long count;
    private Long timestamp;

    public ResultEvent(String name, Long count, Long timestamp) {
        this.name = name;
        this.count = count;
        this.timestamp = timestamp;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String tableName() {
        return "database.result_event";
    }
}
