package com.kodilla.hibernate;

import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DbCheckerTest {
    @Test
    void testConnect() throws SQLException {
        //Given
        //When
        DbChecker dbChecker = DbChecker.INSTANCE;
        //Then
        assertNotNull(dbChecker.getConnection());
    }
}
