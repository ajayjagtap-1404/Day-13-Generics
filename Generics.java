package com.assigenement.generics;

public class Generics {
    public static void main(String[] args) {
        System.out.println("Welcome to Generics Program ");
        Generics findMaxIntNumber = new Generics();
        Integer number1 = 10, number2 = 10, number3 = 40;
        Integer max = findMaxIntNumber.findMaxIntNum(number1, number2, number3);
        System.out.println("Max  Integer number  is : " + max);
    }

    private Integer findMaxIntNum(Integer number1, Integer number2, Integer number3) {
        Integer maximum = number1;
        if (number2.compareTo(maximum) > 0) {
            maximum = number2;
        }
        if (number3.compareTo(maximum) > 0) {
            maximum = number3;
        }
        return maximum;
    }
}
