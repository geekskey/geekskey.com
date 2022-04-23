package com.geekskey.java.classes;

public class AdditionClassExample {

    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int result = add(a, b);
        System.out.println("Result after adding a and is : " + result);
    }

    static int add(int a, int b) {
        return a + b;
    }
}
