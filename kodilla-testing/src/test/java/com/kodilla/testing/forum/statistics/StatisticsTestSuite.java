package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

@DisplayName("Statistics test suite")
@ExtendWith(MockitoExtension.class)
public class StatisticsTestSuite {

    @Mock
    private Statistics statisticsMock;

    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    private List<String> usersList (int usersQuantity){
        ArrayList <String> names = new ArrayList<>();
        for (int i=0; i<usersQuantity; i++) {
            names.add("Name");
        }
        return names;
    }

    @Test
    void testCase0PostsQuantity() {

        //Given
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        int postsQuantity = 0;
        int commentQuantity = 100;
        when(statisticsMock.usersNames()).thenReturn(usersList(10));
        when(statisticsMock.postsCount()).thenReturn(postsQuantity);
        when(statisticsMock.commentsCount()).thenReturn(commentQuantity);

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        Assertions.assertEquals(10,statisticsCalculator.getUsersQuantity());
        Assertions.assertEquals(0,statisticsCalculator.getPostsQuantity());
        Assertions.assertEquals(100,statisticsCalculator.getCommentQuantity());
        Assertions.assertEquals(0,statisticsCalculator.getAveragePostsPerUser());
        Assertions.assertEquals(10,statisticsCalculator.getAverageCommentsPerUser());
        Assertions.assertEquals(0,statisticsCalculator.getAverageCommentsPerPost());
    }

    @Test
    void testCase1000PostsQuantity() {

        //Given
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        int postsQuantity = 1000;
        int commentQuantity = 50;
        when(statisticsMock.usersNames()).thenReturn(usersList(5));
        when(statisticsMock.postsCount()).thenReturn(postsQuantity);
        when(statisticsMock.commentsCount()).thenReturn(commentQuantity);

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        Assertions.assertEquals(5,statisticsCalculator.getUsersQuantity());
        Assertions.assertEquals(1000,statisticsCalculator.getPostsQuantity());
        Assertions.assertEquals(50,statisticsCalculator.getCommentQuantity());
        Assertions.assertEquals(200,statisticsCalculator.getAveragePostsPerUser());
        Assertions.assertEquals(10,statisticsCalculator.getAverageCommentsPerUser());
        Assertions.assertEquals(0,statisticsCalculator.getAverageCommentsPerPost());
    }

    @Test
    void testCase0CommentsQuantity() {

        //Given
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        int postsQuantity = 50;
        int commentQuantity = 0;
        when(statisticsMock.usersNames()).thenReturn(usersList(10));
        when(statisticsMock.postsCount()).thenReturn(postsQuantity);
        when(statisticsMock.commentsCount()).thenReturn(commentQuantity);

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        Assertions.assertEquals(10,statisticsCalculator.getUsersQuantity());
        Assertions.assertEquals(50,statisticsCalculator.getPostsQuantity());
        Assertions.assertEquals(0,statisticsCalculator.getCommentQuantity());
        Assertions.assertEquals(5,statisticsCalculator.getAveragePostsPerUser());
        Assertions.assertEquals(0,statisticsCalculator.getAverageCommentsPerUser());
        Assertions.assertEquals(0,statisticsCalculator.getAverageCommentsPerPost());
    }

    @Test
    void testCasePostQuantityBiggerThanCommentsQuantity() {

        //Given
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        int postsQuantity = 1000;
        int commentQuantity = 100;
        when(statisticsMock.usersNames()).thenReturn(usersList(100));
        when(statisticsMock.postsCount()).thenReturn(postsQuantity);
        when(statisticsMock.commentsCount()).thenReturn(commentQuantity);

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        Assertions.assertEquals(100,statisticsCalculator.getUsersQuantity());
        Assertions.assertEquals(1000,statisticsCalculator.getPostsQuantity());
        Assertions.assertEquals(100,statisticsCalculator.getCommentQuantity());
        Assertions.assertEquals(10,statisticsCalculator.getAveragePostsPerUser());
        Assertions.assertEquals(1,statisticsCalculator.getAverageCommentsPerUser());
        Assertions.assertEquals(0,statisticsCalculator.getAverageCommentsPerPost());
        Assertions.assertTrue(statisticsCalculator.getPostsQuantity() > statisticsCalculator.getCommentQuantity());
    }

    @Test
    void testCaseCommentsQuantityBiggerThanPostQuantity() {

        //Given
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        int postsQuantity = 100;
        int commentQuantity = 1000;
        when(statisticsMock.usersNames()).thenReturn(usersList(20));
        when(statisticsMock.postsCount()).thenReturn(postsQuantity);
        when(statisticsMock.commentsCount()).thenReturn(commentQuantity);

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        Assertions.assertEquals(20,statisticsCalculator.getUsersQuantity());
        Assertions.assertEquals(100,statisticsCalculator.getPostsQuantity());
        Assertions.assertEquals(1000,statisticsCalculator.getCommentQuantity());
        Assertions.assertEquals(5,statisticsCalculator.getAveragePostsPerUser());
        Assertions.assertEquals(50,statisticsCalculator.getAverageCommentsPerUser());
        Assertions.assertEquals(10,statisticsCalculator.getAverageCommentsPerPost());
        Assertions.assertTrue(statisticsCalculator.getPostsQuantity() < statisticsCalculator.getCommentQuantity());
    }

    @Test
    void testCase0UsersQuantity() {

        //Given
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        int postsQuantity = 10;
        int commentQuantity = 150;
        when(statisticsMock.usersNames()).thenReturn(usersList(0));
        when(statisticsMock.postsCount()).thenReturn(postsQuantity);
        when(statisticsMock.commentsCount()).thenReturn(commentQuantity);

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        Assertions.assertEquals(0,statisticsCalculator.getUsersQuantity());
        Assertions.assertEquals(10,statisticsCalculator.getPostsQuantity());
        Assertions.assertEquals(150,statisticsCalculator.getCommentQuantity());
        Assertions.assertEquals(0,statisticsCalculator.getAveragePostsPerUser());
        Assertions.assertEquals(0,statisticsCalculator.getAverageCommentsPerUser());
        Assertions.assertEquals(15,statisticsCalculator.getAverageCommentsPerPost());
    }

    @Test
    void testCase100UsersQuantity() {

        //Given
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        int postsQuantity = 135;
        int commentQuantity = 16;
        when(statisticsMock.usersNames()).thenReturn(usersList(100));
        when(statisticsMock.postsCount()).thenReturn(postsQuantity);
        when(statisticsMock.commentsCount()).thenReturn(commentQuantity);

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        Assertions.assertEquals(100,statisticsCalculator.getUsersQuantity());
        Assertions.assertEquals(135,statisticsCalculator.getPostsQuantity());
        Assertions.assertEquals(16,statisticsCalculator.getCommentQuantity());
        Assertions.assertEquals(1,statisticsCalculator.getAveragePostsPerUser());
        Assertions.assertEquals(0,statisticsCalculator.getAverageCommentsPerUser());
        Assertions.assertEquals(0,statisticsCalculator.getAverageCommentsPerPost());
    }

    @Test
    void testCaseHappyForumFullOfActiveUsers() {

        //Given
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        int postsQuantity = 135550;
        int commentQuantity = 575823;
        when(statisticsMock.usersNames()).thenReturn(usersList(1000));
        when(statisticsMock.postsCount()).thenReturn(postsQuantity);
        when(statisticsMock.commentsCount()).thenReturn(commentQuantity);

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        Assertions.assertEquals(1000,statisticsCalculator.getUsersQuantity());
        Assertions.assertEquals(135550,statisticsCalculator.getPostsQuantity());
        Assertions.assertEquals(575823,statisticsCalculator.getCommentQuantity());
        Assertions.assertEquals(135,statisticsCalculator.getAveragePostsPerUser());
        Assertions.assertEquals(575,statisticsCalculator.getAverageCommentsPerUser());
        Assertions.assertEquals(4,statisticsCalculator.getAverageCommentsPerPost());
    }
}