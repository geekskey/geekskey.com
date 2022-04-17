package com.geekskey.java.operators;

public class RelationalOperatorExample {

    public static void main(String[] args) {

        int a = 5;
        int b = 6;
        int c = 5;

        boolean result;

        result = a == c;
        System.out.println("a equals c is :" + result);

        result = a != b;
        System.out.println("a not equals b is :" + result);

        result = a < b;
        System.out.println("a is less than b is :" + result);

        result = b > a;
        System.out.println("b is greater than a is :" + result);

        result = c >= a;
        System.out.println("c is greater than or equal to a is :" + result);
    }
}
