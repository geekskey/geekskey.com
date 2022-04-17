package com.geekskey.java.controlstatements;

public class SwitchExample {

    public static void main(String[] args) {

        int a = 2;
        switch (a) {
            case 1:
                System.out.println("In case 1");
                break;
            case 2:
                System.out.println("In case 2");
                break;
            case 3:
                System.out.println("In case 3");
                break;
            default:
                System.out.println("Inside default case");
        }
    }
}
