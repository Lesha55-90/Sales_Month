package ru.netology.stats.services;

public class StatsService {
    public int getMinSales(int[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // Номер месяца, в котором был минимум продаж
    }

    public int getMaxSales(int[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1; // Номер месяца, в котором был максимум продаж
    }

    public int getSumSales(int[] sales) {
        int sumSales = 0;

        for (int i = 0; i < sales.length; i++) {
            sumSales += sales[i];
        }
        return sumSales;                // Сумма всех продаж
    }

    public int getAveSales(int[] sales) {
        int aveSales = 0;

        for (int i = 0; i < sales.length; i++) {
            aveSales += sales[i];
        }
        return aveSales / sales.length;      // Средняя сумма продаж в месяц
    }

    public int getHiAveSales(int[] sales) {
        int aveSales = getAveSales(sales);
        int count = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > aveSales) {
                count++;
            }
        }
        return count;
    }

    public int getLowAveSales(int[] sales) {
        int aveSales = getAveSales(sales);
        int count = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < aveSales) {
                count++;
            }
        }
        return count;
    }

}
