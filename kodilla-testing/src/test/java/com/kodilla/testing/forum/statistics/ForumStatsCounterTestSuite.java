package com.kodilla.testing.forum.statistics;

import org.junit.Before;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
@ExtendWith(MockitoExtension.class)
@DisplayName
        ("Starting tests...")
public class ForumStatsCounterTestSuite {

    private static int testsLeft = 7;
    private static int testsToDo = 0;
    @Mock
    private Statistics mockedStatistics;

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

    private List<String> userInStats(int usersToPut) {
        List<String> users = new ArrayList<>();
        for (int u = 0; u < 20; u++) {
            users.add("User number " + u);
        }
        return users;
    }

    private List<Integer> generateComms(int insertNumberOfComments) {
        List<Integer> comments = new ArrayList<>();
            for(int c = 0; c <= 1000; c++) {
                comments.add(c);
            }
            return comments;
    }
    private List<Integer> generatePosts(int insertNumberOfPosts) {
        List<Integer> posts = new ArrayList<>();
            for(int p = 0; p <= 1000; p++) {
                posts.add(p);
            }
            return posts;
    }

    @Test
    void testIfPosts0() {
        StatsCounter statsCounter = new StatsCounter();
        List<String> users2 = userInStats(2);
        when(mockedStatistics.postsCount()).thenReturn(0);
        when(mockedStatistics.commentsCount()).thenReturn(11);
        when(mockedStatistics.usersNames()).thenReturn(users2);
        //when
        statsCounter.calculateAdvStatistics(mockedStatistics);
        //then
        Assertions.assertEquals(0, statsCounter.postsCount());
        Assertions.assertEquals(0, statsCounter.getAveragePostsPerUser());
        Assertions.assertEquals(0, statsCounter.getAverageCommentsPerPost());
    }
    @Test
    void testIfPosts1000() {
        StatsCounter statsCounter = new StatsCounter();
        List<String> users10 = userInStats(10);
        List<Integer> posts1000 = generatePosts(1000);
        List<Integer> comments400 = generateComms(400);
        when(mockedStatistics.postsCount()).thenReturn(posts1000.size());
        //when
        statsCounter.calculateAdvStatistics(mockedStatistics);
        //then
        Assertions.assertEquals(posts1000.size(), statsCounter.postsCount());
        Assertions.assertEquals(0, statsCounter.getAveragePostsPerUser());
        Assertions.assertEquals(0, statsCounter.getAverageCommentsPerPost());
    }
    @Test
    void testIfComments0() {
        StatsCounter statsCounter = new StatsCounter();
        List<String> users6 = userInStats(6);
        when(mockedStatistics.commentsCount()).thenReturn(0);
        when(mockedStatistics.postsCount()).thenReturn(0);
        //when
        statsCounter.calculateAdvStatistics(mockedStatistics);
        //then
        Assertions.assertEquals(0, statsCounter.commentsCount());
        Assertions.assertEquals(0, statsCounter.getAverageCommentsPerPost());
        Assertions.assertEquals(0, statsCounter.getAverageCommentsPerUser());
    }

    @Test
    void testIfCommentsLessThanPosts() {
        StatsCounter statsCounter = new StatsCounter();
        when(mockedStatistics.commentsCount()).thenReturn(242);
        when(mockedStatistics.postsCount()).thenReturn(356);
        //when
        statsCounter.calculateAdvStatistics(mockedStatistics);
        //then
        Assertions.assertEquals(356, statsCounter.postsCount());
        Assertions.assertEquals(242, statsCounter.commentsCount());
        Assertions.assertEquals(0, statsCounter.commentsLessThanPosts());
    }
    @Test
    void testIfCommentsMoreThanPosts() {
        StatsCounter statsCounter = new StatsCounter();
        when(mockedStatistics.commentsCount()).thenReturn(600);
        when(mockedStatistics.postsCount()).thenReturn(20);
        //when
        statsCounter.calculateAdvStatistics(mockedStatistics);;
        //then
        Assertions.assertEquals(20, statsCounter.postsCount());
        Assertions.assertEquals(600, statsCounter.commentsCount());
        Assertions.assertEquals(1, statsCounter.postsLessThanComments());
    }
    @Test
    void testNoUsers() {
        StatsCounter statsCounter = new StatsCounter();
        List<String> users0 = new ArrayList<>();
        when(mockedStatistics.usersNames()).thenReturn(users0);
        when(mockedStatistics.commentsCount()).thenReturn(110);
        when(mockedStatistics.postsCount()).thenReturn(300);
        //when
        statsCounter.calculateAdvStatistics(mockedStatistics);
        //then
        Assertions.assertEquals(0, statsCounter.countUsers());
        Assertions.assertEquals(0, statsCounter.getAveragePostsPerUser());
        Assertions.assertEquals(0, statsCounter.getAverageCommentsPerUser());
    }
    @Before
    private List<String> newListfor100(int putNumber) {
        List<String> listof100 = new ArrayList<>();
            for(int x = 0; x < 100; x++) {
                listof100.add("New guy number:" + x);
            }
            return listof100;
    }
    @Test
    void testOver100() {
        StatsCounter statsCounter = new StatsCounter();
        List<String> listOf100 = newListfor100(100);
        when(mockedStatistics.usersNames()).thenReturn(listOf100);
        when(mockedStatistics.postsCount()).thenReturn(568);
        when(mockedStatistics.commentsCount()).thenReturn(744);
        //when
        statsCounter.calculateAdvStatistics(mockedStatistics);
        //then
        Assertions.assertEquals(100, statsCounter.countUsers());
        Assertions.assertEquals(7.44, statsCounter.getAverageCommentsPerUser());
        Assertions.assertEquals(5.68, statsCounter.getAveragePostsPerUser());
    }

}
