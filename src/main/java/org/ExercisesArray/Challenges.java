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

    public void challenge2() {

        System.out.println("""
        -----------------------------------------------------------------------------
        2. Create a new HashMap of type <String, String> and populate it with elements
        containing an email (String) and a name (String). Next, create a new Set and
        populate it with the keys from the HashMap.
        -----------------------------------------------------------------------------
        """);

        HashMap<String, String> emailList = new HashMap<>();

        emailList.put("knowsnothing@stark.com", "John");
        emailList.put("motherof@dragons.com", "Daenerys");
        emailList.put("winteriscoming@winterfell.com", "Eddard");
        emailList.put("nottoday@godofdead.com", "Arya");
        emailList.put("queenof@westeros.com", "Cersei");
        emailList.put("drinkandknow@lannister.com", "Tyrion");
        emailList.put("khalof@khals.com", "Khal Drogo");
        emailList.put("kingslayer@lannister.com", "Jaime");
        emailList.put("unsulliedcommander@astapor.com", "Grey Worm");

        Set<String> emails = new HashSet<>(emailList.keySet());

        System.out.println("HashMap: " + emailList);

        System.out.println("Set with emails: " + emails);

        System.out.println("Emails:");
        for (Map.Entry<String, String> entry : emailList.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println();
        System.out.println("Next is Challenge 3:");
        System.out.println();

    }

}
