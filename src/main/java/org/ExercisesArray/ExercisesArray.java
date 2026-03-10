package org.ExercisesArray;

import java.util.Arrays;

public class ExercisesArray {


    public void exercise1() {

        System.out.println("""
                -----------------------------------------------------------------------------
                1. Write a program which will store elements in an array of type int and print it out.
                Expected output: 11 23 39 etc.
                -----------------------------------------------------------------------------
                """);

        int[] programNumbers = {11, 23, 39, 45};

        System.out.println(Arrays.toString(programNumbers));

        System.out.println();
        System.out.println("Next is exercise 2:");
        System.out.println();

    }


    public int indexOf(int[] array, int number) {

        for (int i = 0; i < array.length; i++) {

            if (array[i] == number) {
                return i;
            }

        }

        return -1;

    }


    public void exercise2() {

        int[] numbers = {1, 3, 5, 7, 9};

        int index = indexOf(numbers, 5);

        System.out.println("""
                -----------------------------------------------------------------------------
                2. Create a program and create a method with name indexOf which will find and return the index
                of an element in the array. If the element doesn’t exist your method should return -1 as value.
                Expected output: Index position of number 5 is: 2
                -----------------------------------------------------------------------------
                """);

        System.out.println("Index position of number 5 is: " + index);

        System.out.println();
        System.out.println("Next is exercise 3:");
        System.out.println();

    }


    public void exercise3() {

        System.out.println("""
                -----------------------------------------------------------------------------
                3. Write a program which will sort a string array.
                Expected output:
                String array: [Paris, London, New York, Stockholm]
                Sorted string array: [London, New York, Paris, Stockholm]
                -----------------------------------------------------------------------------
                """);

        String[] cities = {"Paris", "London", "New York", "Stockholm"};

        System.out.println("String array: " + Arrays.toString(cities));

        Arrays.sort(cities);

        System.out.println("Sorted string array: " + Arrays.toString(cities));

        System.out.println();
        System.out.println("Next is exercise 4:");
        System.out.println();

    }

    public void exercise4() {

        System.out.println("""
                -----------------------------------------------------------------------------
                4. Write a program which will copy the elements of one array into another array.
                   Expected output:
                   Elements from first array: 1 15 20
                   Elements from second array: 1 15 20
                -----------------------------------------------------------------------------
                """);
        System.out.println();
        int[] firstArray = {1, 15, 20};

        int[] secondArray = Arrays.copyOf(firstArray, firstArray.length);

        System.out.println("Elements from first array: ");
        for (int num : firstArray) {
            System.out.println(num + " ");
        }
        System.out.println();

        System.out.println("Elements from second array: ");
        for (int num : secondArray) {
            System.out.println(num + " ");
        }
        System.out.println();
        System.out.println("Next is exercise 5:");
        System.out.println();
    }

    public void exercise5() {

        System.out.println("""
                -----------------------------------------------------------------------------
                5. Create a two-dimensional string array [2][2]. Assign values containing any Country and City.
                   Expected output:
                   France Paris
                   Sweden Stockholm
                -----------------------------------------------------------------------------
                """);
        System.out.println();

        String[][] countriesCities = {
                {"France", "Paris"},
                {"Sweden", "Stockholm"}
        };

        // Nested loop voor printen
        for (int i = 0; i < countriesCities.length; i++) {
            for (int j = 0; j < countriesCities[i].length; j++) {
                System.out.print(countriesCities[i][j] + " "); // gebruik print i.p.v println
            }
            System.out.println(); // nieuwe regel per rij
        }

        System.out.println();
        System.out.println("Next is exercise 6:");
        System.out.println();

    }

    public void exercise6() {

        System.out.println("""
                 -----------------------------------------------------------------------------
                6. Write a program which will set up an array to hold the next values in this order: 
                43, 5, 23, 17, 2, 14 and print the average of these 6 numbers. 
                Expected output: Average is: 17.3
                -------------------------------------------------------
                """);
        System.out.println();

        int [] numbers = {43, 5, 23, 17, 2, 14};

        double sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        double average = sum / numbers.length;

        System.out.printf("Average is: %.1f%n", average);

        System.out.println();
        System.out.println("Next is exercise 7:");
        System.out.println();
    }
}


