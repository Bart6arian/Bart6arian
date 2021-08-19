package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.function.DoubleFunction;
import java.util.stream.Collectors;

public class MainStream {
    public static void main(String[] args) {

        Forum forum = new Forum();
        System.out.println("All users in forum: "+ forum.getUsersList().size());
        System.out.println();
        Map<Integer, ForumUser> resultList = (Map<Integer, ForumUser>) forum.getUsersList().stream()
                .filter(forumUser -> forumUser.getGender() =='M')
                .filter(forumUser -> forumUser.getBirthday().getYear() < 2001)
                .filter(forumUser -> forumUser.getPosts() >= 1)
                .collect(Collectors.toMap(ForumUser::getUserId, forumUser -> forumUser));

        System.out.println("All users fit to params: " +resultList.size());
        resultList.entrySet().stream()
                .map(entry -> "Users id: "+entry.getKey() +" : "+entry.getValue())
                .forEach(System.out::println);
        System.out.println();
        System.out.println("Search for specific user...");
        resultList = (Map<Integer, ForumUser>) forum.getUsersList().stream()
                .filter(forumUser -> forumUser.getUsername().length() < 15)
                .filter(forumUser -> forumUser.getUsername().charAt(0) == 'J')
                .collect(Collectors.toMap(ForumUser::getUserId, forumUser -> forumUser));
        resultList.entrySet().stream()
                .map(entry -> "User to ban id: "+ entry.getKey() +" nickname: "+entry.getValue().getUsername() +" ; posts to delete: " +entry.getValue().getPosts())
                .forEach(System.out::println);
    }
}
