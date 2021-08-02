package com.kodilla;

public class Calculator {
    int a;
    int b;
    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public static void add(int a, int b) {
        System.out.println("Sum = " +(a+b));
    }
    public static void subtract(int a, int b) {
        System.out.println("Subtract = " +(a-b));
    }

    public static void main(String[] args) {
        add(44,29);
        subtract(93,19);
    }
}
