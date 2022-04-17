package com.geekskey.java.operators;

public class TernaryOperatorExample {

    public static void main(String[] args) {
        int a = 2;
        int b = 2;

        int c = a == b ? 5 : 6;
        System.out.println("Value of c is : "+ c);

        int d = a != b ? 5 : 6;
        System.out.println("Value of d is : "+ d);
    }
}
