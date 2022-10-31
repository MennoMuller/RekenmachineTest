package com.mennomuller;

public class Rekenmachine {

    public int optellen(int a, int b) {
        return a + b;
    }

    public int aftrekken(int a, int b) {
        return a - b;
    }

    public int vermenigvuldigen(int a, int b) {
        return a * b;
    }

    public int delen(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Divide by zero not allowed");
        }
        return (int) Math.round(a / (double) b);
    }

    public int machtsverheffen(int a, int b) {
        return (int) Math.round(Math.pow(a, b));
    }

    public int worteltrekken(int a, int b) {
        if (a < 0 && b % 2 == 0) {
            throw new ArithmeticException("Complex numbers not supported");
        }
        return (int) Math.round(Math.pow(a, (1.0 / b)));
    }
}
