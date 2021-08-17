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
        for (int u = 1; u < 20; u++) {
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
        List<Integer> posts0 = generatePosts(0);
        List<Integer> comments11= generateComms(11);
        when(mockedStatistics.postsCount()).thenReturn(posts0.size());
        //when
        statsCounter.calculateAdvStatistics(mockedStatistics);
        //then
        Assertions.assertEquals(posts0.size(), statsCounter.postsCount());
        Assertions.assertEquals(users2.size()/posts0.size(), statsCounter.getAveragePostsPerUser());
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
        List<Integer> posts200 = generatePosts(200);
        List<Integer> comments0 = generateComms(0);
        when(mockedStatistics.commentsCount()).thenReturn(comments0.size());
        //when
        statsCounter.calculateAdvStatistics(mockedStatistics);
        //then
        Assertions.assertEquals(comments0.size(), statsCounter.commentsCount());
        Assertions.assertEquals(0, statsCounter.getAverageCommentsPerPost());
        Assertions.assertEquals(0, statsCounter.getAverageCommentsPerUser());
    }

    @Test
    void testIfCommentsLessThanPosts() {
        StatsCounter statsCounter = new StatsCounter();
        List<String> users18 = userInStats(18);
        List<Integer> posts500 = generatePosts(500);
        List<Integer> comments242 = generateComms(242);
        when(mockedStatistics.commentsCount()).thenReturn(comments242.size());
        when(mockedStatistics.postsCount()).thenReturn(posts500.size());
        //when
        statsCounter.calculateAdvStatistics(mockedStatistics);
        //then
        Assertions.assertEquals(posts500.size(), statsCounter.postsCount());
        Assertions.assertEquals(comments242.size(), statsCounter.commentsCount());
        Assertions.assertEquals(comments242.size(), posts500.size());
    }
    @Test
    void testIfCommentsMoreThanPosts() {
        StatsCounter statsCounter = new StatsCounter();
        List<String> users4 = userInStats(4);
        List<Integer> posts20 = generatePosts(20);
        List<Integer> comments600 = generateComms(600);
        when(mockedStatistics.commentsCount()).thenReturn(comments600.size());
        when(mockedStatistics.postsCount()).thenReturn(posts20.size());
        //when
        statsCounter.calculateAdvStatistics(mockedStatistics);;
        //then
        Assertions.assertEquals(posts20.size(), statsCounter.postsCount());
        Assertions.assertEquals(comments600.size(), statsCounter.commentsCount());
        Assertions.assertEquals(comments600.size(), posts20.size());
    }
    @Test
    void testNoUsers() {
        StatsCounter statsCounter = new StatsCounter();
        List<String> users0 = userInStats(0);
        List<Integer> posts300 = generatePosts(300);
        List<Integer> comments110 = generateComms(110);
        when(mockedStatistics.usersNames()).thenReturn(users0);
        //when
        statsCounter.calculateAdvStatistics(mockedStatistics);
        //then
        Assertions.assertEquals(users0.size(), statsCounter.countUsers());
        Assertions.assertEquals(statsCounter.postsCount()/statsCounter.countUsers(), statsCounter.getAveragePostsPerUser());
        Assertions.assertEquals(statsCounter.commentsCount()/statsCounter.countUsers(), statsCounter.getAverageCommentsPerUser());
    }
    @Before
    private List<String> newListfor100(int putNumber) {
        List<String> listof100 = new ArrayList<>();
            for(int x = 0; x <= 100; x++) {
                listof100.add("New guy number:" + x);
            }
            return listof100;
    }
    @Test
    void testOver100() {
        StatsCounter statsCounter = new StatsCounter();
        List<String> listOf100 = newListfor100(100);
        List<Integer> posts568 = generatePosts(568);
        List<Integer> comments744 = generateComms(744);
        when(mockedStatistics.usersNames()).thenReturn(listOf100);
        //when
        statsCounter.calculateAdvStatistics(mockedStatistics);
        //then
        Assertions.assertEquals(listOf100.size(), statsCounter.countUsers());
        Assertions.assertEquals(statsCounter.commentsCount()/statsCounter.countUsers(), statsCounter.getAverageCommentsPerUser());
        Assertions.assertEquals(statsCounter.postsCount()/statsCounter.countUsers(), statsCounter.getAveragePostsPerUser());
    }

}
