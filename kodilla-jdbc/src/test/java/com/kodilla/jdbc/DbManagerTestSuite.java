package com.kodilla.jdbc;

import org.junit.jupiter.api.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.jupiter.api.Assertions.*;

public class DbManagerTestSuite {

    @Test
    void testConnection() throws SQLException {
        //given

        //when
        DbManager dbManager = DbManager.getInstance();
        //then
        assertNotNull(dbManager.getConnection());
    }

    @Test
    void testSelectUsers() throws SQLException {
        //given
        DbManager dbManager = DbManager.INSTANCE;

        //when
        String sqlQuery = "SELECT * FROM USERS";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

        //then
        int counter = 0;
        while (rs.next()) {
            System.out.println(rs.getInt("ID") + ", " +
                    rs.getString("FIRSTNAME") + ", " +
                    rs.getString("LASTNAME"));
            counter++;
        }
        rs.close();
        statement.close();
        assertEquals(5, counter);
    }

    @Test
    void testSelectUsersAndPosts() throws SQLException {
        //given
        DbManager dbManager = DbManager.INSTANCE;
        //when
        String query = "SELECT U.FIRSTNAME, U.LASTNAME, COUNT(*) AS POSTS_NUMBER FROM USERS U JOIN" +
                " POSTS P ON U.ID = P.USER_ID GROUP BY U.FIRSTNAME, U.LASTNAME HAVING COUNT(*) > 2";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet resultSet = statement.executeQuery(query);

        //then
        int count = 0;
        while (resultSet.next()) {
            System.out.println(resultSet.getString("FIRSTNAME") + ", "
                    + resultSet.getString("LASTNAME") + ", "
                    + resultSet.getInt("POSTS"));
            count++;
        }
        resultSet.close();
        statement.close();
        assertNotEquals(2, count);
    }

}
