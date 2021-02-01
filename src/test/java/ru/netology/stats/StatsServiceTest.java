package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    StatsService service = new StatsService();
    int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void calculateSum() {
        int actual = service.calculateSum(sales);
        int expected = 180;

        assertEquals(expected, actual);
    }

    @Test
    void arithmeticmeanSum() {
        float actual = service.averageSum(sales);
        int expected = 15;

        assertEquals(expected, actual);
    }

    @Test
    void maxSaleMonth() {
        float actual = service.maxMonthSale(sales);
        int expected = 8;

        assertEquals(expected, actual);
    }
    @Test
    void minSaleMonth() {
        float actual = service.minMonthSale(sales);
        int expected = 9;

        assertEquals(expected, actual);
    }
    @Test
    void quantityMonthBelowAverage() {
        float actual = service.numberBelowAverage(sales);
        int expected = 5;

        assertEquals(expected, actual);
    }

    @Test
    void quantityMonthAboveAverage() {
        float actual = service.numberAboveAverage(sales);
        int expected = 5;

        assertEquals(expected, actual);
    }
}