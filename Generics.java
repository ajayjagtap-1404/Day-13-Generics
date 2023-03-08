package com.assigenement.generics;

public class Generics {
    public static void main(String[] args) {
        System.out.println("Welcome to Generics Program ");
        Generics findMaxIntNumber = new Generics();
        Integer number1 = 10, number2 = 10, number3 = 40;
        Float floatNumber1 = 2.5f, floatNumber2 = 10.3f, floatNumber3 = 7.6f;
        Integer max = findMaxIntNumber.findMaxIntNum(number1, number2, number3);
        System.out.println("Max  Integer number  is : " + max);
        Float maxFloatNumber = new Generics().findMaxNum(floatNumber1,floatNumber2,floatNumber3);
        System.out.println("Max float number is : " + maxFloatNumber);
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
    private Float findMaxNum(Float floatNumber1, Float floatNumber2, Float floatNumber3) {
        Float maximum = floatNumber1;
        if (floatNumber2.compareTo(maximum) > 0) {
            maximum = floatNumber2;
        } else if (floatNumber3.compareTo(maximum) > 0) {
            maximum = floatNumber3;
        }
        return maximum;

    }
}
