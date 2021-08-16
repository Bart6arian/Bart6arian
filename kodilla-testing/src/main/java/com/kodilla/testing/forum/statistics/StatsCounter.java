package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.List;

public class StatsCounter {
    private Statistics statistics;

    private int users;
    private int comments;
    private int posts;
    private double averagePostsPerUser;
    private double averageCommentsPerUser;
    private double averageCommentsPerPost;

    public double getAveragePostsPerUser() {
        if(posts > 0) {
            return averagePostsPerUser = (posts / users);
        }
        return 0;
    }

    public double getAverageCommentsPerUser() {
        if(users > 0) {
            return averageCommentsPerUser = (comments / users);
        }
        return 0;
    }

    public double getAverageCommentsPerPost() {
        if(comments > 0) {
            return averageCommentsPerPost = (comments / posts);
        }
        return 0;
    }

    public int commentsLessThanPosts() {
        return 0;
    }

    public int postsCount() {
        return posts;
    }

    public int countUsers() {
        return users;
    }

    public int commentsCount() {
        return comments;
    }

    public List<String> usersNames() {
        List<String> getNames = new ArrayList<>();
        for(String name : usersNames()){
            getNames.add(name);
        }
        return getNames;
    }

    public void calculateAdvStatistics(Statistics statistics) {

        this.users = statistics.usersNames().size();
        this.comments = statistics.commentsCount();
        this.posts = statistics.postsCount();
        averageCommentsPerPost = getAverageCommentsPerUser();
        averagePostsPerUser = getAveragePostsPerUser();
        averageCommentsPerPost = getAveragePostsPerUser();

    }
    public void showStats() {
        System.out.println("Average comments per post: "+getAverageCommentsPerPost() + "\n" +
                "Average comments per user: " +getAverageCommentsPerUser() +"\n" +
                "Average posts per user: " +getAveragePostsPerUser() +"\n" +
                "Comments less than posts: "+ commentsLessThanPosts() +"\n" +
                "Total users on forum: " +countUsers() +"\n" +
                "Names of users: "+ usersNames());
    }
}
