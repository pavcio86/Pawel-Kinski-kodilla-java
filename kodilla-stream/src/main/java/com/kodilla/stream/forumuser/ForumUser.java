package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private final int uniqueIdentifier;
    private final String name;
    private final int numberOfPublishedPosts;
    private final char sex;
    private final LocalDate dateOfBirth;


    public ForumUser(final int uniqueIdentifier, final String name, final int numberOfPublishedPosts, final  char sex, final int yearOfBirth,
                     final int monthOfBirth, final int dayOfBirth) {
        this.uniqueIdentifier = uniqueIdentifier;
        this.name = name;
        this.numberOfPublishedPosts = numberOfPublishedPosts;
        this.sex = sex;
        this.dateOfBirth = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);

    }

    public int getUniqueIdentifier() {
        return uniqueIdentifier;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfPublishedPosts() {
        return numberOfPublishedPosts;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
}
