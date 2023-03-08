package com.assigenement.generics;

public class Generics {
    public static void main(String[] args) {
        System.out.println("Welcome to Generics Program ");
        Generics findMaxIntNumber = new Generics();
        Integer number1 = 10, number2 = 10, number3 = 40;
        Float floatNumber1 = 2.5f, floatNumber2 = 10.3f, floatNumber3 = 7.6f;
        String name1 = "Apple", name2 = "Banana", name3 = "Mango";

        Integer max = findMaxIntNumber.findMaxNum(number1, number2, number3);
        System.out.println("Max  Integer number  is : " + max);
        Float maxFloatNumber = new Generics().findMaxNum(floatNumber1, floatNumber2, floatNumber3);
        System.out.println("Max float number is : " + maxFloatNumber);
        String maxString = new Generics().findMaxNum(name1, name2, name3);
        System.out.println("Max String value is : " + maxString);
    }

    private <E extends Comparable> E findMaxNum(E name1, E name2, E name3) {
        E max = name1;
        if (name2.compareTo(max) > 0) {
            max = name2;
        }
        if (name3.compareTo(max) > 0) {
            max = name3;
        }
        return max;
    }

}
