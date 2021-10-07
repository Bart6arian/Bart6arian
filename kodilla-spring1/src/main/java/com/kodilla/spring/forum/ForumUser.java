package com.kodilla.spring.forum;

import org.springframework.stereotype.Component;

@Component
public class ForumUser implements Username {
    private final String username;

    public ForumUser(String username) {
        this.username = "John Smith";
    }

    @Override
    public String getUsername() {
        return username;
    }
}
