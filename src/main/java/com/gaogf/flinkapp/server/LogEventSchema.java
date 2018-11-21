package com.gaogf.flinkapp.server;

import com.gaogf.flinkapp.bean.LogEvent;
import org.apache.flink.api.common.ExecutionConfig;
import org.apache.flink.api.common.serialization.DeserializationSchema;
import org.apache.flink.api.common.serialization.SerializationSchema;
import org.apache.flink.api.common.typeinfo.TypeInformation;
import org.apache.flink.streaming.util.serialization.KeyedDeserializationSchema;

import java.io.*;

/**
 * @author gaogf
 * @param
 */
public class LogEventSchema implements DeserializationSchema<LogEvent> ,SerializationSchema<LogEvent> {

    @Override
    public LogEvent deserialize(byte[] message) throws IOException {
        if (message.length > 0){
            try(ByteArrayInputStream inputStream = new ByteArrayInputStream(message);
                ObjectInputStream objectInputStream = new ObjectInputStream(inputStream)){
                LogEvent object = (LogEvent)objectInputStream.readObject();
                return object;
            }catch (ClassNotFoundException e) {
                e.printStackTrace();
                return new LogEvent();
            }
        }else {
            return new LogEvent();
        }

    }

    @Override
    public boolean isEndOfStream(LogEvent nextElement) {
        return false;
    }

    @Override
    public TypeInformation<LogEvent> getProducedType() {
        return TypeInformation.of(LogEvent.class);
    }

    @Override
    public byte[] serialize(LogEvent element) {
        byte[] message = null;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        try (ObjectOutputStream stream = new ObjectOutputStream(outputStream)) {
            stream.writeObject(element);
            stream.flush();
            message = outputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return message;
    }
}
