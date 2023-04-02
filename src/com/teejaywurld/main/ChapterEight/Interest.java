package com.teejaywurld.main.ChapterEight;

import java.math.BigDecimal;
import java.text.NumberFormat;

public class Interest {

    public static void main(String[] args) {

        BigDecimal principal = BigDecimal.valueOf(2000.0);
        BigDecimal rate = BigDecimal.valueOf(0.05);

        System.out.printf("%s%25s%n", "Year", "Amount On Deposit");

        for (int year = 1; year <= 10; year++) {
            BigDecimal amount = principal.multiply(rate.add(BigDecimal.ONE).pow(year));

            System.out.printf("%3d%20s%n", year, NumberFormat.getCurrencyInstance().format(amount));
        }
    }
}
