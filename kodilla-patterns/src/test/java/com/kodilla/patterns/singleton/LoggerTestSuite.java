package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {

    private static Logger logger;

    @BeforeAll
    public static void saveToLog() {
        logger = Logger.INSTANCE;
        String log = "something";
        logger.log(log);
    }

    @Test
    public void lastLogTest() {
        //given
        //when
        String lastLog = logger.getLastLog();
        System.out.println("Last log: "+lastLog);
        //then
        assertEquals("something", lastLog);
    }

}
