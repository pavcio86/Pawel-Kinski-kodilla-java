package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> forumUsersList = new ArrayList<>();

    public Forum() {
        forumUsersList.add(new ForumUser(1, "Diego", 0, 'M', 1976, 5, 11));
        forumUsersList.add(new ForumUser(2, "Marija", 56, 'F', 1976, 7, 2));
        forumUsersList.add(new ForumUser(3, "Francisco", 12, 'M', 1988, 6, 17));
        forumUsersList.add(new ForumUser(4, "Camila", 0, 'F', 1976, 8, 30));
        forumUsersList.add(new ForumUser(5, "Alejandro", 84, 'M', 2010, 8, 22));
        forumUsersList.add(new ForumUser(6, "Margarita", 10, 'F', 1976, 2, 12));
        forumUsersList.add(new ForumUser(7, "Jose", 45, 'M', 2011, 6, 15));
        forumUsersList.add(new ForumUser(8, "Carmen", 92, 'F', 1976, 9, 1));
        forumUsersList.add(new ForumUser(9, "Miquel", 1, 'M', 1996, 3, 23));
        forumUsersList.add(new ForumUser(10, "Victoria", 0, 'F', 1976, 10, 14));
        forumUsersList.add(new ForumUser(11, "Antionio", 105, 'M', 1966, 6, 28));
    }
    public List<ForumUser> getList() {
        return new ArrayList<>(forumUsersList);

    }
}

