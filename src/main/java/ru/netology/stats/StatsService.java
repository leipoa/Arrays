package ru.netology.stats;

public class StatsService {
    public long getSum(long[] sales) {
        long sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];

        }
        return sum;
    }

    public long getAverage(long[] sales) {
        long sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        long average = sum / sales.length;
        return average;


    }

    public int getMaxMonth(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int getMinMonth(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int getMonthsBelowAverage(long[] sales) {
        long averageSale = getAverage(sales);
        int MonthsBelowAverage = 0;
        for (long sale : sales) {
            if (sale < averageSale) {
                MonthsBelowAverage++;
            }
        }
        return MonthsBelowAverage;
    }

    public int getMonthsAboveAverage(long[] sales) {
        long averageSale = getAverage(sales);
        int MonthsAboveAverage = 0;
        for (long sale : sales) {
            if (sale > averageSale) {
                MonthsAboveAverage++;
            }
        }
        return MonthsAboveAverage;
    }
}



