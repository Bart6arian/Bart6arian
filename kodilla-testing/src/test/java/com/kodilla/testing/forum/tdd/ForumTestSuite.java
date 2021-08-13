package com.kodilla.testing.forum.tdd;

import com.kodilla.testing.forum.ForumComment;
import com.kodilla.testing.forum.ForumPost;
import com.kodilla.testing.forum.ForumUser;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName
        ("TDD: Forum test suite")
public class ForumTestSuite {
    private static int tryCounter = 0;
    private static int left = 8;

    @BeforeAll
    public static void befAll() {
        System.out.println("All tests ready");
    }
    @AfterAll
    public static void afAll() {
        System.out.println("All tests are done");
    }
    @AfterEach
    public void afEach() {
        tryCounter++;
        System.out.println("Test no." + tryCounter+" has been done");
    }
    @BeforeEach
    public void bfEach() {
        left--;
        System.out.println(left+" tests left");
    }

    @Nested
    @DisplayName("Test for removes")
    class TestRemoves {
        @Nested
        @DisplayName("Test for not existed")
        class NotExisting {
            @Test
            void testRemovePostNotExisted() {
                ForumUser forumUser = new ForumUser("JN9", "Jan Nowak");
                ForumPost forumPost = new ForumPost("JN9", "Hi all");
                //when
                boolean result = forumUser.removePost(forumPost);
                //then
                assertFalse(result);
            }

            @Test
            void testRemoveCommentNotExisting() {
                ForumUser forumUser = new ForumUser("JN9", "Jan Nowak");
                ForumPost forumPost = new ForumPost("JN9", "Hi all");
                ForumComment forumComment = new ForumComment(forumPost, "Thanks", "JN9");
                //when
                boolean result = forumUser.removeComment(forumComment);
                //then
                assertFalse(result);
            }
        }
        @Test
        void testRemovePost() {
            ForumUser forumUser = new ForumUser("JN9", "Jan Nowak");
            ForumPost forumPost = new ForumPost("JN9", "Hi all");
            forumUser.addPost(forumPost.getAuthor(), forumPost.getPostBody());
            //when
            boolean result = forumUser.removePost(forumPost);
            //then
            assertTrue(result);
            assertEquals(0, forumUser.getCommentsQuantity());
        }
        @Test
        void testRemoveComment() {
            ForumUser forumUser = new ForumUser("JN9", "Jan Nowak");
            ForumPost forumPost = new ForumPost("JN9", "Hi all");
            ForumComment forumComment = new ForumComment(forumPost, "Thanks", "JN9");
            forumUser.addComment(forumPost, forumComment.getAuthor(), forumComment.getCommentBody());
            //when
            boolean result = forumUser.removeComment(forumComment);
            //then
            assertTrue(result);
            assertEquals(0, forumUser.getCommentsQuantity());
        }
    }
    @Test
    void testAddPost() {
        ForumUser forumUser = new ForumUser("JN9", "Jan Nowak");
        //when
        forumUser.addPost("JN9", "Hi all");
        //then
        assertEquals(1, forumUser.getPostsQuantity());
    }
    @Test
    void testAddComment() {
        ForumUser forumUser = new ForumUser("JN9", "Jan Nowak");
        ForumPost forumPost = new ForumPost("JN9", "Hi all");
        //when
        forumUser.addComment(forumPost, "JN9", "Thanks");
        //then
        assertEquals(1, forumUser.getCommentsQuantity());
    }
    @Test
    void testGetPost() {
        ForumUser forumUser = new ForumUser("JN9", "Jan Nowak");
        ForumPost forumPost = new ForumPost("Hi all", "JN9");
        forumUser.addPost(forumPost.getAuthor(), forumPost.getPostBody());
        //when
        ForumPost retrievedPost;
        retrievedPost = forumUser.getPost(0);
        //then
        assertEquals(forumPost, retrievedPost);
    }
    @Test
    void testGetComment() {
        ForumUser forumUser = new ForumUser("JN9", "Jan Nowak");
        ForumPost forumPost = new ForumPost("JN9", "Hi all");
        ForumComment forumComment = new ForumComment(forumPost, "Thanks", "JN9");
        forumUser.addComment(forumPost, forumComment.getAuthor(), forumComment.getCommentBody());
        //when
        ForumComment retrievedComment = forumUser.getComment(0);
        //then
        assertEquals(forumComment, retrievedComment);
    }

}
