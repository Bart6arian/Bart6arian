package com.kodilla.testing.forum;

import com.kodilla.testing.user.SimpleUser;
import org.junit.jupiter.api.*;

public class ForumTestSuit {

    @BeforeEach
    public void before() {
        System.out.println("Test case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test case: end");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test suit begin");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test suit finito");
    }

    @DisplayName
            ("When return SimpleUser name, "+"then getUsername method return name")

    @Test
    void testCaseRealname() {
        //Given
        SimpleUser simpleUser = new SimpleUser("theForumUser", "John Rambo");

        //When
        String result = simpleUser.getRealname();
        System.out.println("Testing: " + result);

        //Then
        Assertions.assertEquals("John Rambo", result);
    }
    @DisplayName
            ("When create SimpleUser with name, "+ "then getUsername return realname")
    @Test
    void testCaseUsername() {
        //given
        SimpleUser simpleUser = new SimpleUser("theForumUser", "John Rambo");
        String toExpect = "theForumUser";
        //when
        String result = simpleUser.getUserName();
        Assertions.assertEquals(toExpect, result);
    }
}
