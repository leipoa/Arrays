package ru.netology.stats;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class StatsServiceTest {

    @Test
    public void shouldFindSum() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actualSum = service.getSum(sales);
        long expectedSum = 180;

        Assertions.assertEquals(expectedSum, actualSum);

    }

    @Test
    public void shouldFindAverage() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actualAverage = service.getAverage(sales);
        long expectedAverage = 15;

        Assertions.assertEquals(expectedAverage, actualAverage);
    }

    @Test
    public void shouldFindMaxMonth() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actualMaxMonth = service.getMaxMonth(sales);
        long expectedMaxMonth = 8;

        Assertions.assertEquals(expectedMaxMonth, actualMaxMonth);
    }

    @Test
    public void shouldFindMinMonth() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actualMinMonth = service.getMinMonth(sales);
        long expectedMinMonth = 9;

        Assertions.assertEquals(expectedMinMonth, actualMinMonth);
    }

    @Test
    public void shouldFindMonthsBelowAverage() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actualMonthsBelowAverage = service.getMonthsBelowAverage(sales);
        long expectedMonthsBelowAverage = 5;

        Assertions.assertEquals(expectedMonthsBelowAverage, actualMonthsBelowAverage);
    }

    @Test
    public void shouldFindMonthsAboveAverage() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actualMonthsAboveAverage = service.getMonthsAboveAverage(sales);
        long expectedMonthsAboveAverage = 5;

        Assertions.assertEquals(expectedMonthsAboveAverage, actualMonthsAboveAverage);
    }
}
