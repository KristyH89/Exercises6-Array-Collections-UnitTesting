package org.ExercisesArray;
import java.time.DayOfWeek;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.*;

public class CollectionExercises {

    public void collectionExercise1() {

        System.out.println("""
                -----------------------------------------------------------------------------
                1. Create a new list and populate it with the days of the week. Lastly, print out the list.
                -----------------------------------------------------------------------------
                """);
        List<String> daysOfWeek = new ArrayList<>();

        daysOfWeek.add("Monday");
        daysOfWeek.add("Tuesday");
        daysOfWeek.add("Wednesday");
        daysOfWeek.add("Thursday");
        daysOfWeek.add("Friday");
        daysOfWeek.add("Saturday");
        daysOfWeek.add("Sunday");

        // And now a better version

        List<String> daysOfWeekS = new ArrayList<>(Arrays.asList(
                "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
        ));

        System.out.print("Days of the week: " + daysOfWeek);
        System.out.println();
        System.out.print("Days of the week in a shorter code: " + daysOfWeekS);

        System.out.println();
        System.out.println();
        System.out.println("Next is Collectionexercise 2:");
        System.out.println();
    }

    public void collectionExercise2() {

        System.out.println("""
                -----------------------------------------------------------------------------
                2. Create a new list and populate it with the days of the week.
                   Lastly, iterate through the list and print out each element separately.
                -----------------------------------------------------------------------------
                """);
        List<String> daysOfWeek2 = new ArrayList<>(Arrays.asList(
                "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
        ));

        System.out.print("Days of the week (separatley):");
        for (String day : daysOfWeek2) {
            System.out.println(day);
        }
        System.out.println();

        System.out.println("Next is Collectionexercise 3:");
        System.out.println();

    }

    public void collectionExercise3() {

        System.out.println("""
                -----------------------------------------------------------------------------
                3. Create a new list and populate it with the days of the week excluding THURSDAY.
                   Lastly, insert the weekday THURSDAY into the correct position in the list.
                -----------------------------------------------------------------------------
                """);

        List<String> daysOfWeek3 = new ArrayList<>(Arrays.asList(
                "Monday", "Tuesday", "Wednesday", "Friday", "Saturday", "Sunday"
        ));

        daysOfWeek3.add(3, "Thursday");

        System.out.print("Days of the week in correct order:");
        for (String day : daysOfWeek3) {
            System.out.println(day);
        }

        System.out.println();
        System.out.println("Next is Collectionexercise 4:");
        System.out.println();

    }

    public void collectionExercise4() {

        System.out.println("""
                -----------------------------------------------------------------------------
                4. Create a new list and populate it with the days of the week. 
                   Then create a new list out of the first three elements of the first list using a subList.
                -----------------------------------------------------------------------------
                """);

        List<String> daysOfWeek4 = new ArrayList<>(Arrays.asList(
                "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
        ));

        List<String> firstThreeDays = daysOfWeek4.subList(0, 3);

        System.out.println("Original list: " + daysOfWeek4);
        System.out.println("First three days: " + firstThreeDays);

        System.out.println();
        System.out.println("Next is Collectionexercise 5:");
        System.out.println();

    }

    public void collectionExercise5() {

        System.out.println("""
                -----------------------------------------------------------------------------
                5. Create a new HashSet and populate it with the days of the week. 
                   Lastly, print the set and pay attention to the order of the elements.
                -----------------------------------------------------------------------------
                """);
        Set<String> daysOfWeekSet = new HashSet<>(Arrays.asList(
                "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
        ));

        System.out.println("HashSet of days: " + daysOfWeekSet);

        System.out.println();
        System.out.println("Next is Collectionexercise 6:");
        System.out.println();

    }
    public void collectionExercise6() {

        System.out.println("""
    -----------------------------------------------------------------------------
    6. Create a new HashSet and populate it with the days of the week.
       Then convert the HashSet to an ArrayList.
    -----------------------------------------------------------------------------
    """);

        HashSet<String> daysSet = new HashSet<>(Arrays.asList(
                "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
        ));

        System.out.println("HashSet of days: " + daysSet);

        ArrayList<String> daysList = new ArrayList<>(daysSet);

        System.out.println("Converted to ArrayList: " + daysList);

        System.out.println();
        System.out.println("Next is Collectionexercise 7:");
        System.out.println();
}

    public void collectionExercise7() {

        System.out.println("""
        -----------------------------------------------------------------------------
        8. Create a new HashSet and populate it with random names. Then convert the HashSet
        to an ArrayList. Lastly, manually sort the list in alphabetical order and print it out.
        -----------------------------------------------------------------------------
        """);

        HashSet<String> namesSet = new HashSet<>(Arrays.asList(
                "Legolas", "Gimli", "Frodo", "Gandalf", "Aragorn", "Sam", "Pipin", "Arwen"
        ));

        System.out.println("HashSet of names: " + namesSet);

        ArrayList<String> namesList = new ArrayList<>(namesSet);
        Collections.sort(namesList);

        System.out.println("Sorted ArrayList: " + namesList);

        System.out.println();
        System.out.println("Next is Collectionexercise 8:");
        System.out.println();
    }
}