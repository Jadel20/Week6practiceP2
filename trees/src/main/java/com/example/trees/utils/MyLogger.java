package com.example.trees.utils;


import java.time.ZonedDateTime;

public class MyLogger {
    public static void log(String message, LogLevel logLevel) {
        var now = ZonedDateTime.now();
        System.out.println(now + " " + message + " " + logLevel);
    }

    public static void log(String message) {
        log(message, LogLevel.INFO);
    }
}
