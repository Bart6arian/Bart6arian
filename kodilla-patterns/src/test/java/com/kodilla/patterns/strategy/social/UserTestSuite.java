package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.media.FacebookPublisher;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        //given
        User ralph = new Millenials("Ralph Merlin");
        User john = new ZGeneration("John Cactus");
        User nick = new YGeneration("Nick Nacks");

        //when
        String whereRalphPosts = ralph.share();
        System.out.println("Ralph posted on: "+ whereRalphPosts);
        String whereJohnPosts = john.share();
        System.out.println("John posts on: "+whereJohnPosts);
        String whereNickPosts = nick.share();
        System.out.println("Nick posts on: "+whereNickPosts);

        //then
        assertEquals("Snapchat", whereRalphPosts);
        assertEquals("Twitter", whereJohnPosts);
        assertEquals("Facebook", whereNickPosts);
    }

    @Test
    void testIndividualSharingStrategy() {
        //given
        User ralph = new Millenials("Ralph Merlin");

        //when
        String whereRalphPosts = ralph.share();
        System.out.println("Ralph posted on: "+ whereRalphPosts);
        ralph.setPostingStrategy(new FacebookPublisher());
        whereRalphPosts = ralph.share();
        System.out.println("Ralph posts on: " + whereRalphPosts);

        //then
        assertEquals("Facebook", whereRalphPosts);
    }
}
