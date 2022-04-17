package com.geekskey.java.operators;

public class ArithmeticOperatorExample {

    public static void main(String[] args) {
        int a = 3;
        int b = 6;
        int result;

        result = a + b;
        System.out.println("a + b is : " + result);

        result = b - a;
        System.out.println("b - a is : " + result);

        result = b * a;
        System.out.println("b * a is : " + result);

        result = b / a;
        System.out.println("b / a is : " + result);

        result = a % b;
        System.out.println("a % b is : " + result);

        a--;
        System.out.println("Value of a after decrement is : " + a);

        a++;
        System.out.println("Value of a after increment is : " + a);

    }
}
