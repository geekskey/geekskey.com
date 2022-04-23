package com.geekskey.java.classes;

public class AddClassExample {
    public static void main(String[] args) {
        Add addObject; // Creating a reference for Add class object
        addObject = new Add(); // Creating and assigning object to add object

        int result = addObject.addition(2, 3);
        System.out.println("Result after addition is : " + result);
    }
}

class Add {
    int addition(int x, int y) {
        return x + y;
    }
}
