package com.gaogf.flinkapp;

import com.gaogf.flinkapp.server.LogEventApp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FlinkAppApplication implements CommandLineRunner {
    @Autowired
    private LogEventApp app;

    public static void main(String[] args) {
        SpringApplication.run(FlinkAppApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        app.run();
    }
}
