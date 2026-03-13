package org.ExercisesArray;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

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

}