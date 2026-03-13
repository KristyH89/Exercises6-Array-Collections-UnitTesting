package org.ExercisesArray;

import java.util.Arrays;
import java.util.Scanner;

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

        int[] numbers = {43, 5, 23, 17, 2, 14};

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

    public void exercise7() {

        System.out.println("""
                -----------------------------------------------------------------------------
                7. Write a program which will set up an array to hold 10 numbers and print out only the uneven numbers.
                Example:
                Array: 1 2 4 7 9 12
                Odd Array: 1 7 9
                -----------------------------------------------------------------------------
                """);

        // Array met 10 getallen
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Print originele array
        System.out.print("Array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Print alleen oneven getallen
        System.out.print("Odd Array: ");
        for (int num : numbers) {
            if (num % 2 != 0) { // check of het oneven is
                System.out.print(num + " ");
            }
        }
        System.out.println();

        System.out.println();
        System.out.println("Next is exercise 8:");
        System.out.println();
    }

    public void exercise8() {

        System.out.println("""
                -----------------------------------------------------------------------------
                8. Write a program which will remove the duplicate elements of a given array
                [20, 20, 40, 20, 30, 40, 50, 60, 50]
                
                Expected output:
                Array: 20 20 40 20 30 40 50 60 50
                Array without duplicates: 20 40 30 50 60
                -----------------------------------------------------------------------------
                """);

        int[] numbers8 = {20, 20, 40, 20, 30, 40, 50, 60, 50};

        System.out.print("Array: ");
        for (int num : numbers8) {
            System.out.print(num + " ");

        }

        System.out.println();

        System.out.print("Array without duplicates: ");
        for (int i = 0; i < numbers8.length; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < i; j++) {
                if (numbers8[i] == numbers8[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                System.out.print(numbers8[i] + " ");
            }
        }
        System.out.println();
        System.out.println("Next is exercise 9:");
        System.out.println();
    }


    public int[] addElement(int[] array, int newNumber) {

        int[] newArray = new int[array.length + 1];

        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }

        newArray[array.length] = newNumber;

        return newArray;


    }


    public void exercise9() {

        System.out.println("""
                -----------------------------------------------------------------------------
                9. Write a method which will add elements in an array.
                Remember that arrays are fixed in size so you need to expand the array.
                -----------------------------------------------------------------------------
                """);

        int[] numbers9 = {10, 20, 30};

        numbers9 = addElement(numbers9, 40);

        for (int num : numbers9) {
            System.out.print(num + " ");
        }

        System.out.println();
        System.out.println();
        System.out.println("Next is exercise 10:");
        System.out.println();

    }

    public void exercise10() {

        System.out.println("""
                -----------------------------------------------------------------------------
                10. Write a program which will represent multiplication table stored in a
                multidimensional array.
                -----------------------------------------------------------------------------
                """);

        int[][] table = new int[10][10];

        for (int i = 0; i < table.length; i++) {

            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = (i + 1) * (j + 1);

            }
        }

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.printf("%4d", table[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Next is exercise 11:");
        System.out.println();
    }

    public void exercise11() {

        System.out.println("""
                -----------------------------------------------------------------------------
                11. Write a program that ask the user for an integer and repeat that question
                 until user give you a specific value that user already has been told about as 
                 a message in your program. Store these values in an array and print that array. 
                 After that reverse the array elements so that the first element becomes the 
                 last element, the second element becomes the second to last element, etc. 
                 Do not just reverse the order in which they are printed. 
                 You need to change the way they are stored in the array.
                -----------------------------------------------------------------------------
                """);

        Scanner scanner = new Scanner(System.in);

        int[] numbers11 = new int[0];
        int input;

        System.out.println("Enter integers (-1 to stop):");

        while (true) {
            input = scanner.nextInt();

            if (input == -1) {
                break;

            }
            numbers11 = addElement(numbers11, input);

        }
        System.out.println("Array: " + Arrays.toString(numbers11));

        for (int i = 0; i < numbers11.length / 2; i++) {
            int temp = numbers11[i];
            numbers11[i] = numbers11[numbers11.length - 1 - i];
            numbers11[numbers11.length - 1 - i] = temp;
        }

        System.out.println("Reversed array: " + Arrays.toString(numbers11));

        System.out.println();
        System.out.println("Next is exercise 12:");
        System.out.println();
    }

    public void exercise12() {

        System.out.println("""
                -----------------------------------------------------------------------------
                12. Write a program which prints the diagonal elements of a two-dimensional array.
                -----------------------------------------------------------------------------
                """);

        int[][] matrix = {
                {1, 2, 3},
                {2, 4, 6},
                {3, 6, 9}
        };
        System.out.print("Diagonal elements: ");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][i] + " ");
        }
        System.out.println();

        System.out.println();
        System.out.println("Next is exercise 13:");
        System.out.println();


    }

    public void exercise13() {

        System.out.println("""
                -----------------------------------------------------------------------------
                13. Create two arrays with arbitrary size and fill one with random numbers. 
                Then copy over the numbers from the array with random numbers so that the even 
                numbers are located in the rear (the right side) part of the array and the odd 
                numbers are located in the front part (the left side).
                -----------------------------------------------------------------------------
                """);

        int size = 10;

        int[] randomArray = new int[size];
        int[] resultArray = new int[size];

        java.util.Random random = new java.util.Random();

        for (int i = 0; i < size; i++) {
            randomArray[i] = random.nextInt(100);
        }
        System.out.print("Random array: " + java.util.Arrays.toString(randomArray));

        int left = 0;
        int right = size -1;

        for (int num : randomArray) {

            if (num % 2 != 0 ) {
                resultArray[left] = num;
                left++;
            } else {
                resultArray[right] = num;
                right--;
            }
        }

        System.out.print("Result array: " + java.util.Arrays.toString(resultArray));
        System.out.println();
        System.out.println();
        System.out.println("This was the last one of the Array exercises, the next ones are collection exercises!");
    }

}


