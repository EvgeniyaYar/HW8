package ru.netology;

public class StatService {
    public int amountSales(int[] sales) {
        int amount = 0;

        for (int i = 0; i < sales.length; i++) amount += sales[i];
        return amount;
    }

    public int middleAmountSales(int[] sales) {
        int amount = 0;
        for (int i = 0; i < sales.length; i++) amount += sales[i];
        int middle = amount / sales.length;
        return middle;
    }
    public int numberOfMaxMonth(int[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int numberOfMinMonth(int[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int salesLowerThanMiddle(int[] sales) {
        int middleSales = middleAmountSales(sales);
        int months = 0;
        for(int i = 0; i < sales.length; i++) {
            if (sales[i] < middleSales) {
                months++;
            }
        }
        return months;
    }

    public int salesHigherThanMiddle(int[] sales) {
        int middleSales = middleAmountSales(sales);
        int months = 0;
        for(int i = 0; i < sales.length; i++) {
            if (sales[i] > middleSales) {
                months++;
            }
        }
        return months;
    }
}

