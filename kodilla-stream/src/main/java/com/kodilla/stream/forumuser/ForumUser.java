package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int userId;
    private final String username;
    private final char gender;
    private final LocalDate birthday;
    private final int posts;

    public ForumUser(int userId, String username, int year, int month, int day, int posts, char gender) {
        this.userId = userId;
        this.username = username;
        this.birthday = LocalDate.of(year, month, day);
        this.posts = posts;
        this.gender = gender;
    }

    public int getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public char getGender() {
        return gender;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public int getPosts() {
        return posts;
    }

    @Override
    public String toString() {
        return "ForumUser { " +
                "Forum's nickname: " + username + '\'' +
                ", gender: " + gender +
                ", day of birth: " + birthday +
                ", posts on forum: " + posts +
                '}';
    }

}
