package org.example;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.math.BigDecimal;
public class Main {
    public static void main(String[] args) {
        // Sử dụng double
        double priceDouble = 0.1;
        double quantityDouble = 0.2;
        double totalDouble = calculateTotalDouble(priceDouble, quantityDouble);
        System.out.println("Total using double: " + totalDouble);

        // Sử dụng BigDecimal
        BigDecimal priceBigDecimal = new BigDecimal("0.1");
        BigDecimal quantityBigDecimal = new BigDecimal("0.2");
        BigDecimal totalBigDecimal = calculateTotalBigDecimal(priceBigDecimal, quantityBigDecimal);
        System.out.println("Total using BigDecimal: " + totalBigDecimal);

        // So sánh kết quả
        compareResults(totalDouble, totalBigDecimal);
    }

    public static double calculateTotalDouble(double price, double quantity) {
        return price + quantity;
    }

    public static BigDecimal calculateTotalBigDecimal(BigDecimal price, BigDecimal quantity) {
        return price.add(quantity);
    }
    public static void compareResults(double doubleResult, BigDecimal bigDecimalResult) {
        // Chuyển đổi BigDecimal sang double để so sánh
        if (Double.compare(doubleResult, bigDecimalResult.doubleValue()) == 0) {
            System.out.println("Hai kết quả bằng nhau.");
        } else {
            System.out.println("Hai kết quả không bằng nhau.");
        }
    }
}