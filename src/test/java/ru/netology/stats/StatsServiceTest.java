package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class StatsServiceTest {

    private int[] example = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void testingSumArray(){
        int trueResult = 180;
        long result = StatsService.calculateSum(example);
        Assertions.assertEquals(trueResult, result);
    }

    @Test
    void testingAverage(){
        int answer = 15;
        long resultAnswer = StatsService.calculateAverage(example);
        Assertions.assertEquals(answer, resultAnswer);
    }

    @Test
    void testingMaxSales() {
        int answerMax = 7;
        long resultAnswer = StatsService.getIndexMaxSales(example);
        Assertions.assertEquals(answerMax, resultAnswer);
    }

    @Test
    void testingMinSales() {
        int answerMin = 8;
        long resultAnswer = StatsService.getIndexMinSales(example);
        Assertions.assertEquals(answerMin, resultAnswer);
    }

    @Test
    void testingBelowAverageSalesAmount() {
        int answerCountMin = 5;
        long resultAnswer = StatsService.indexBelowAverage(example);
        Assertions.assertEquals(answerCountMin, resultAnswer);
    }

    @Test
    void testingHigherAverageSalesAmount() {
        int answerCountMax = 5;
        long resultAnswer = StatsService.indexHigherAverage(example);
        Assertions.assertEquals(answerCountMax, resultAnswer);
    }

//    @Test
//    void testingBelowAverageSalesAmount() {
//        int answerCountMin = 1;
//        long resultAnswer = StatsService.indexAverage(example, false );
//        Assertions.assertEquals(answerCountMin, resultAnswer);
//    }
//
//    @Test
//    void testingHigherAverageSalesAmount() {
//        int answerCountMax = 1;
//        long resultAnswer = StatsService.indexAverage(example, true);
//        Assertions.assertEquals(answerCountMax, resultAnswer);
//    }
}
