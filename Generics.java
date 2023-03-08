package com.assigenement.generics;

public class Generics<T extends Comparable> {
    T data1, data2, data3;

    Generics(T data1, T data2, T data3) {
        this.data1 = data1;
        this.data2 = data2;
        this.data3 = data3;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Generics Program ");
        Integer number1 = 10, number2 = 10, number3 = 40;
        Float floatNumber1 = 2.5f, floatNumber2 = 10.3f, floatNumber3 = 7.6f;
        String name1 = "Apple", name2 = "Banana", name3 = "Mango";
        System.out.println("Maximum Integer value is " + testMaximum(number1, number2, number3));
        System.out.println("Maximum Float value is " + testMaximum(floatNumber1, floatNumber2, floatNumber3));
        System.out.println("Maximum String value is " + testMaximum(name1, name2, name3));


    }

    private static <E extends Comparable> E testMaximum(E name1, E name2, E name3) {
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
