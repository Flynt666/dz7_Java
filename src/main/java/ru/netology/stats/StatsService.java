package ru.netology.stats;


public class StatsService {

    //1 метод
    public long allSales(long[] sales) {
        long summa = 0;
        for (long sale : sales) {
            summa = summa + sale;
        }
        return summa;
    }

    //2 метод
    public long averageSales(long[] sales) {
        long aveSales = allSales(sales) / sales.length;
        return aveSales;
    }

    //3 метод
    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    // 4 метод
    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    //5 метод
    public int belowAveSales(long[] sales) {
        int quantBelowAve = 0;
        long aveSales = averageSales(sales);
        for (long sale : sales) {
            if (sale < aveSales)
                quantBelowAve = quantBelowAve + 1;
        }
        return quantBelowAve;

    }
    //6 метод
    public int underAveSales(long[] sales) {
        int quantUnderAve = 0;
        long aveSales = averageSales(sales);
        for (long sale : sales) {
            if (sale > aveSales)
                quantUnderAve = quantUnderAve + 1;
        }
        return quantUnderAve;

    }
}






