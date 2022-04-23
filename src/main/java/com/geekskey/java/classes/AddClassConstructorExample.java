package com.geekskey.java.classes;

public class AddClassConstructorExample {

    public static void main(String[] args) {
        Addition addObject; // Creating a reference for Add class object
        addObject = new Addition(2, 3); // Creating and assigning object to add object

        int result = addObject.add();
        System.out.println("Result after addition is : " + result);
    }
}

class Addition {
    int x;
    int y;

    Addition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int add() {
        return x + y;
    }
}