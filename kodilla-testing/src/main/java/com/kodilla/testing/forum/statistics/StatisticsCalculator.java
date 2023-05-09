package com.kodilla.testing.forum.statistics;

import java.util.List;

class StatisticsCalculator {

    private int usersQuantity;
    private int postsQuantity;
    private int commentQuantity;
    private int averagePostsPerUser;
    private int averageCommentsPerUser;
    private int averageCommentsPerPost;



    public int getUsersQuantity() {
        return usersQuantity;
    }

    public int getPostsQuantity() {
        return postsQuantity;
    }

    public int getCommentQuantity() {
        return commentQuantity;
    }

    public int getAveragePostsPerUser() {
        return averagePostsPerUser;
    }

    public int getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public int getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }

    public void calculateAdvStatistics(Statistics statistics){

         usersQuantity = statistics.usersNames().size();

         postsQuantity = statistics.postsCount();

         commentQuantity = statistics.commentsCount();

         if (usersQuantity == 0){
             averagePostsPerUser = 0;
         }else{
             averagePostsPerUser = postsQuantity / usersQuantity;
         }

         if (usersQuantity == 0) {
             averageCommentsPerUser = 0;
         }else{
             averageCommentsPerUser = commentQuantity / usersQuantity;
         }

         if (postsQuantity == 0) {
             averageCommentsPerPost = 0;
         }else{
             averageCommentsPerPost = commentQuantity / postsQuantity;
         }
    }

    public  String showStatistics(){
        return "StatisticsCalculator{" +
                "usersQuantity=" + usersQuantity +
                ", postsQuantity=" + postsQuantity +
                ", commentQuantity=" + commentQuantity +
                ", averagePostsPerUser=" + averagePostsPerUser +
                ", averageCommentsPerUser=" + averageCommentsPerUser +
                ", averageCommentsPerPost=" + averageCommentsPerPost +
                '}';
    }
}