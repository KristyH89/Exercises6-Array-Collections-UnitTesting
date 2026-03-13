package org.ExercisesArray;
import java.util.*;

public class Challenges {


    public void challenge1() {

        System.out.println("""
                -----------------------------------------------------------------------------
                1. Create an empty Set and populate it with all the days of the week. 
                Next, create a second Set and populate it with only the weekend days 
                (SATURDAY and SUNDAY). Lastly, compare the two sets and retain in the first 
                set only those days that are the same in both sets.
                -----------------------------------------------------------------------------
                """);

        Set<String> allDays = new HashSet<>(Arrays.asList(
                "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
        ));

        Set<String> weekend = new HashSet<>(Arrays.asList(
                "Saturday", "Sunday"
        ));

        allDays.retainAll(weekend);

        System.out.println("Remaining days: " + allDays);

    }

}
