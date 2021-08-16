package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.*;
import org.mockito.Mock;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@DisplayName
        ("Starting tests...")
public class ForumStatsCounterTestSuite {

    private static int testsLeft = 7;
    private static int testsToDo = 0;
    private Statistics mockedStatistics;
    private Statistics statistics = mock(Statistics.class);

    @BeforeEach
    void bfEach() {
        testsToDo++;
        System.out.println("Tests to do: " + testsToDo);
    }
    @AfterEach
    void afEach() {
        testsLeft--;
        System.out.println("Tests left: "+testsLeft);
    }

    @Test
    void testIfPosts0() {
        StatsCounter statsCounter = new StatsCounter();
        when(statistics.postsCount()).thenReturn(0);
        //when
        statsCounter.calculateAdvStatistics(mockedStatistics);
        //then
        Assertions.assertEquals(0, statsCounter.postsCount());
        Assertions.assertEquals(2.4, statsCounter.getAveragePostsPerUser());
        Assertions.assertEquals(1.2, statsCounter.getAverageCommentsPerPost());
    }
    @Test
    void testIfPosts1000() {
        StatsCounter statsCounter = new StatsCounter();
        when(statistics.postsCount()).thenReturn(1000);
        //when
        statsCounter.calculateAdvStatistics(mockedStatistics);
        //then
        Assertions.assertEquals(1000, statsCounter.postsCount());
        Assertions.assertEquals(50, statsCounter.getAveragePostsPerUser());
        Assertions.assertEquals(0.005, statsCounter.getAverageCommentsPerPost());
    }
    @Test
    void testIfComments0() {
        StatsCounter statsCounter = new StatsCounter();
        when(statistics.commentsCount()).thenReturn(0);
        //when
        statsCounter.calculateAdvStatistics(mockedStatistics);
        //then
        Assertions.assertEquals(0, statsCounter.commentsCount());
        Assertions.assertEquals(1.2, statsCounter.getAverageCommentsPerPost());
        Assertions.assertEquals(2.2, statsCounter.getAverageCommentsPerUser());
    }

    @Test
    void testIfCommentsLessThanPosts() {
        StatsCounter statsCounter = new StatsCounter();
        when(mockedStatistics.commentsCount()).thenReturn(5);
        when(mockedStatistics.postsCount()).thenReturn(25);
        //when
        statsCounter.calculateAdvStatistics(mockedStatistics);
        //then
        Assertions.assertEquals(25, statsCounter.postsCount());
        Assertions.assertEquals(5, statsCounter.commentsCount());
        Assertions.assertEquals(2, statsCounter.getAverageCommentsPerPost());
        Assertions.assertEquals(0.5, statsCounter.getAverageCommentsPerUser());
        Assertions.assertEquals(1.5, statsCounter.getAveragePostsPerUser());
    }
    @Test
    void testIfCommentsMoreThanPosts() {
        StatsCounter statsCounter = new StatsCounter();
        //when
        statsCounter.calculateAdvStatistics(mockedStatistics);
        //then
        Assertions.assertEquals(5, statsCounter.postsCount());
        Assertions.assertEquals(25, statsCounter.commentsCount());
        Assertions.assertEquals(5, statsCounter.getAverageCommentsPerPost());
        Assertions.assertEquals(1.5, statsCounter.getAverageCommentsPerUser());
        Assertions.assertEquals(0.5, statsCounter.getAveragePostsPerUser());
    }
    @Test
    void testNoUsers() {
        StatsCounter statsCounter = new StatsCounter();
        List<String> list = new ArrayList<>();
        when(mockedStatistics.usersNames()).thenReturn(list);
        //when
        statsCounter.calculateAdvStatistics(mockedStatistics);
        //then
        Assertions.assertEquals(0, statsCounter.countUsers());
        Assertions.assertEquals(2.2, statsCounter.getAveragePostsPerUser());
        Assertions.assertEquals(1.2, statsCounter.getAverageCommentsPerUser());
    }
    @Test
    void testUsers100() {
        StatsCounter statsCounter = new StatsCounter();
        List<String> listof100 = new ArrayList<>();
            for(int x = 0; x < 101; x++) {
                listof100.add("New guy number:"+x);
            }
        when(mockedStatistics.usersNames()).thenReturn(listof100);
        //when
        statsCounter.calculateAdvStatistics(mockedStatistics);
        //then
        Assertions.assertEquals(100, statsCounter.countUsers());
        Assertions.assertEquals(0.7, statsCounter.getAverageCommentsPerUser());
        Assertions.assertEquals(2.3, statsCounter.getAveragePostsPerUser());
    }

}
