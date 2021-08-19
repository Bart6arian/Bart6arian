package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> usersList = new ArrayList<>();

    public Forum() {
        usersList.add(new ForumUser(2141, "AlwaysHere", 2003, 5, 11, 210, 'M'));
        usersList.add(new ForumUser(2412, "Sleepyyy", 1998, 11, 3, 480, 'F'));
        usersList.add(new ForumUser(3311, "StayAw3y", 2002, 1, 28, 110, 'F'));
        usersList.add(new ForumUser(1890, "Jack0", 1999, 8, 27, 5, 'M'));
        usersList.add(new ForumUser(1246, "ShinyJoe99", 1999, 3, 30, 12, 'M'));
        usersList.add(new ForumUser(8819, "CleanAndJerk88", 1988, 8, 17, 128, 'M'));
    }

    public List<ForumUser> getUsersList() {
        return new ArrayList<>(usersList);
    }
}
