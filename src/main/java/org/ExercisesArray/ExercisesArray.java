package org.ExercisesArray;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class ExercisesArray {


/* 1. Write a program which will store elements in an array of type int and print it out.
Expected output: 11 23 39 etc.  */

    public void exercise1() {
        int[] programNumbers = {11, 23, 39, 45};

        System.out.println(Arrays.toString(programNumbers));

    }

/* 2. Create a program and create a method with name indexOf which will find and return the index
of an element in the array. If the element doesn’t exist your method should return -1 as value.
Expected output: Index position of number 5 is: 2     */
        int[] numbers = {1, 3, 5, 7, 9};

    public int indexOf(int[] array, int number) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return i;
            }
        }
        return -1;

    }
    public void exercise2() {
        int index = indexOf(numbers, 5);
        System.out.println("Index position of number 5 is: " + index);
    }

/* 3. Write a program which will sort a string array.
Expected output:
String array: [Paris, London, New York, Stockholm]
Sorted string array: [London, New York, Paris, Stockholm]  */

public void exercise3() {

    String[] cities = {"Paris", "London", "New York", "Stockholm"};

    System.out.println("String array: " + Arrays.toString(cities));

    Arrays.sort(cities);

    System.out.println("Sorted string array: " + Arrays.toString(cities));

}


}