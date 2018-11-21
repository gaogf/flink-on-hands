package com.gaogf.flinkapp.sink;

import com.gaogf.flinkapp.util.FieldsParse;
import com.mysql.cj.jdbc.ServerPreparedStatement;
import org.apache.flink.streaming.api.functions.sink.RichSinkFunction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.io.ByteArrayInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * @author gaogf
 * @param <T>
 */
public class MySQLSink<T extends TableResult> extends RichSinkFunction<T> {
    private static final long serialVersionUID = -8712613194021724326L;
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public void invoke(T value, Context context) throws Exception {
        String sql = "LOAD DATA LOCAL INFILE 'sql.csv' IGNORE INTO TABLE " + value.tableName()+ " (" + FieldsParse.getFields(value.getClass()) + ")";
        Connection conn = jdbcTemplate.getDataSource().getConnection();
        PreparedStatement statement = conn.prepareStatement(sql);
        if (statement.isWrapperFor(com.mysql.cj.jdbc.ServerPreparedStatement.class)){
            PreparedStatement mysql = statement.unwrap(ServerPreparedStatement.class);
            ((ServerPreparedStatement) mysql)
                    .setLocalInfileInputStream(new ByteArrayInputStream(value.toString().getBytes()));
            mysql.executeUpdate();
        }
    }
}
