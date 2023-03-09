package com.assigenement.generics;

public class Generics<T extends Comparable<T>> {


    public static void main(String[] args) {
        Generics generics = new Generics();
        System.out.println("Welcome to Generics Program ");
        generics.testMaximum(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);
        generics.testMaximum(1.1, 2.2, 3.3, 4.4, 5.5);
        generics.testMaximum("Hello", "This", "Is", "String", "Array");

    }

    public T testMaximum(T... input) {
        T max = input[0];
        for (int i = 0; i < input.length; i++) {
            if (input[i].compareTo(max) > 0)
                max = input[i];
        }
        System.out.println("The maximum Value is : " + max);
        return max;
    }
}
