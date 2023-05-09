package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;

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

    @Test
    void testCase0PostsQuantity() {

        //Given
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        int usersQuantity = 0;
        int postsQuantity = 0;
        int commentQuantity = 0;
        when(statisticsMock.usersNames()).thenReturn(new ArrayList<>());
        when(statisticsMock.postsCount()).thenReturn(postsQuantity);
        when(statisticsMock.commentsCount()).thenReturn(commentQuantity);

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        Assertions.assertEquals(0,statisticsCalculator.getUsersQuantity());
        Assertions.assertEquals(0,statisticsCalculator.getPostsQuantity());
        Assertions.assertEquals(0,statisticsCalculator.getCommentQuantity());
        Assertions.assertEquals(0,statisticsCalculator.getAveragePostsPerUser());
        Assertions.assertEquals(0,statisticsCalculator.getAverageCommentsPerUser());
        Assertions.assertEquals(0,statisticsCalculator.getAverageCommentsPerPost());
    }

    @Test
    void testCase1000PostsQuantity() {

        //Given
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        int usersQuantity = 0;
        int postsQuantity = 1000;
        int commentQuantity = 0;
        when(statisticsMock.usersNames()).thenReturn(new ArrayList<>());
        when(statisticsMock.postsCount()).thenReturn(postsQuantity);
        when(statisticsMock.commentsCount()).thenReturn(commentQuantity);

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        Assertions.assertEquals(0,statisticsCalculator.getUsersQuantity());
        Assertions.assertEquals(1000,statisticsCalculator.getPostsQuantity());
        Assertions.assertEquals(0,statisticsCalculator.getCommentQuantity());
        Assertions.assertEquals(0,statisticsCalculator.getAveragePostsPerUser());
        Assertions.assertEquals(0,statisticsCalculator.getAverageCommentsPerUser());
        Assertions.assertEquals(0,statisticsCalculator.getAverageCommentsPerPost());
    }

    @Test
    void testCase0CommentsQuantity() {

        //Given
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        int usersQuantity = 0;
        int postsQuantity = 0;
        int commentQuantity = 0;
        when(statisticsMock.usersNames()).thenReturn(new ArrayList<>());
        when(statisticsMock.postsCount()).thenReturn(postsQuantity);
        when(statisticsMock.commentsCount()).thenReturn(commentQuantity);

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        Assertions.assertEquals(0,statisticsCalculator.getUsersQuantity());
        Assertions.assertEquals(0,statisticsCalculator.getPostsQuantity());
        Assertions.assertEquals(0,statisticsCalculator.getCommentQuantity());
        Assertions.assertEquals(0,statisticsCalculator.getAveragePostsPerUser());
        Assertions.assertEquals(0,statisticsCalculator.getAverageCommentsPerUser());
        Assertions.assertEquals(0,statisticsCalculator.getAverageCommentsPerPost());
    }

    @Test
    void testCasePostQuantityBiggerThanCommentsQuantity() {

        //Given
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        int usersQuantity = 0;
        int postsQuantity = 1000;
        int commentQuantity = 100;
        when(statisticsMock.usersNames()).thenReturn(new ArrayList<>());
        when(statisticsMock.postsCount()).thenReturn(postsQuantity);
        when(statisticsMock.commentsCount()).thenReturn(commentQuantity);

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        Assertions.assertEquals(0,statisticsCalculator.getUsersQuantity());
        Assertions.assertTrue(statisticsCalculator.getPostsQuantity() > statisticsCalculator.getCommentQuantity());
        Assertions.assertEquals(0,statisticsCalculator.getAveragePostsPerUser());
        Assertions.assertEquals(0,statisticsCalculator.getAverageCommentsPerUser());
        Assertions.assertEquals(0,statisticsCalculator.getAverageCommentsPerPost());
    }

    @Test
    void testCaseCommentsQuantityBiggerThanPostQuantity() {

        //Given
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        int usersQuantity = 0;
        int postsQuantity = 100;
        int commentQuantity = 1000;
        when(statisticsMock.usersNames()).thenReturn(new ArrayList<>());
        when(statisticsMock.postsCount()).thenReturn(postsQuantity);
        when(statisticsMock.commentsCount()).thenReturn(commentQuantity);

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        Assertions.assertEquals(0,statisticsCalculator.getUsersQuantity());
        Assertions.assertTrue(statisticsCalculator.getPostsQuantity() < statisticsCalculator.getCommentQuantity());
        Assertions.assertEquals(0,statisticsCalculator.getAveragePostsPerUser());
        Assertions.assertEquals(0,statisticsCalculator.getAverageCommentsPerUser());
        Assertions.assertEquals(10,statisticsCalculator.getAverageCommentsPerPost());
    }

    @Test
    void testCase0UsersQuantity() {

        //Given
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        int usersQuantity = 0;
        int postsQuantity = 0;
        int commentQuantity = 0;
        when(statisticsMock.usersNames()).thenReturn(new ArrayList<>());
        when(statisticsMock.postsCount()).thenReturn(postsQuantity);
        when(statisticsMock.commentsCount()).thenReturn(commentQuantity);

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        Assertions.assertEquals(0,statisticsCalculator.getUsersQuantity());
        Assertions.assertEquals(0,statisticsCalculator.getPostsQuantity());
        Assertions.assertEquals(0,statisticsCalculator.getCommentQuantity());
        Assertions.assertEquals(0,statisticsCalculator.getAveragePostsPerUser());
        Assertions.assertEquals(0,statisticsCalculator.getAverageCommentsPerUser());
        Assertions.assertEquals(0,statisticsCalculator.getAverageCommentsPerPost());
    }

    @Test
    void testCase100UsersQuantity() {

        //Given
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        ArrayList <String> names = new ArrayList<>();
        for (int i=0; i<100; i++) {
            names.add("Name");
        }
        int postsQuantity = 0;
        int commentQuantity = 0;
        when(statisticsMock.usersNames()).thenReturn(names);
        when(statisticsMock.postsCount()).thenReturn(postsQuantity);
        when(statisticsMock.commentsCount()).thenReturn(commentQuantity);

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        Assertions.assertEquals(100,statisticsCalculator.getUsersQuantity());
        Assertions.assertEquals(0,statisticsCalculator.getPostsQuantity());
        Assertions.assertEquals(0,statisticsCalculator.getCommentQuantity());
        Assertions.assertEquals(0,statisticsCalculator.getAveragePostsPerUser());
        Assertions.assertEquals(0,statisticsCalculator.getAverageCommentsPerUser());
        Assertions.assertEquals(0,statisticsCalculator.getAverageCommentsPerPost());
    }
}