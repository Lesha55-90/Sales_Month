package ru.netology.stats.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void shouldFindMonthMinSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSales = 9;
        int actualSales = service.getMinSales(sales);

        Assertions.assertEquals(expectedSales, actualSales);
    }

    @Test
    public void shouldFindMonthMaxSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSales = 8;
        int actualSales = service.getMaxSales(sales);

        Assertions.assertEquals(expectedSales, actualSales);
    }

    @Test
    public void shouldFindMonthSumSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSales = 180;
        int actualSales = service.getSumSales(sales);

        Assertions.assertEquals(expectedSales, actualSales);
    }

    @Test
    public void shouldFindMonthAveSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSales = 15;
        int actualSales = service.getAveSales(sales);

        Assertions.assertEquals(expectedSales, actualSales);
    }

    @Test
    public void shouldFindHiAveSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSales = 5;
        int actualSales = service.getHiAveSales(sales);

        Assertions.assertEquals(expectedSales, actualSales);
    }

    @Test
    public void shouldFindLowAveSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSales = 5;
        int actualSales = service.getLowAveSales(sales);

        Assertions.assertEquals(expectedSales, actualSales);
    }
}
