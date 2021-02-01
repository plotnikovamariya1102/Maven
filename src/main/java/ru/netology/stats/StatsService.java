package ru.netology.stats;

public class StatsService {
    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public float averageSum(int[] sales) {
        return (float) calculateSum(sales) / sales.length;
    }

    public int maxMonthSale(int[] sales) {
        int maxSale = sales[0];
        int month = 1;
        int maxMonth = 0;
        for (int sale : sales) {
            if (sale >= maxSale) {
                maxSale = sale;
                maxMonth = month;
            }
            month++;
        }
        return maxMonth;
    }
    public int minMonthSale(int[] sales) {
        int minSale = sales[0];
        int month = 1;
        int minManth = 0;
        for (int sale : sales) {
            if (sale <= minSale) {
                minSale = sale;
                minManth = month;
            }
            month++;
        }
        return minManth;
    }

    public int numberBelowAverage(int[] sales) {
        float average = averageSum(sales);
        int numberMonth = 0;
        for (int sale : sales) {
            if (sale < average) {numberMonth++;}
        }
        return numberMonth;
    }
    public int numberAboveAverage(int[] sales) {
        float average = averageSum(sales);
        int numberMonth = 0;
        for (int sale : sales) {
            if (sale > average) {numberMonth++;}
        }
        return numberMonth;
    }
}