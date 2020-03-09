package Java_Collections;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        // ArrayList
        System.out.println("\nArrayLists are resizable arrays. Useful when your database will be modified and you" +
                " want to save space.");
        System.out.println("------------------------------------------------------------------------");
        List planetList = new ArrayList();
        planetList.add("Mercury");
        planetList.add("Venus");
        planetList.add("Earth");
        planetList.add("Mars");
        planetList.add("Jupiter");
        planetList.add("Saturn");
        planetList.add("Uranus");
        planetList.add("Neptune");
        planetList.add("Pluto");

        int len = planetList.size();
        for (int i = 0; i < len; i++ ) {
            Object planet = planetList.get(i);
            System.out.print(planet + "\n");
        }

        System.out.println("\n");
        System.out.println("Size of array:" + planetList.size());
        planetList.remove(8);
        System.out.println("Item removed.");
        System.out.println("Size of array:" +  planetList.size() + "\n");

        len = planetList.size();
        for (int i = 0; i < len; i++ ) {
            Object planet = planetList.get(i);
            System.out.print(planet + "\n");
        }

        System.out.print("\n \n");

        // Set
        System.out.println("HashSets do not allow duplicate entries, so this is useful when every entry in a database " +
                "needs to be unique.");
        System.out.println("------------------------------------------------------------------------");
        int oddSet[] = {7, 7, 9, 13, 11, 11, 11, 3, 1, 5, 5};
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < 11; i++) {
            set.add(oddSet[i]);
        }
        System.out.println(set + "\n \n");

        //  Map
        System.out.println("HashMap Of First Lines. Hash maps map keys and values together in pairs.");
        System.out.println("------------------------------------------------------------------------");
        Map bookLines = new HashMap();
        bookLines.put("Fahrenheit 451", "It was a pleasure to burn.");
        bookLines.put("The Princess Bride", "This is my favorite book in all the world, though I have never read it.");
        bookLines.put("The Hobbit", "In a hole in the ground, there lived a hobbit.");
        bookLines.put("Peter Pan", "All children, except on, grow up.");
        bookLines.put("Moby Dick", "Call Me Ishmael");

        bookLines.forEach((key, value) -> System.out.println("Book: " + key
                + ". First Line: " + value));

        // Queue
        System.out.println("\n\nQueue Example. Queues keep elements in the order you add them. This is important" +
                "for when you need to keep things in chronological or hierarchical order.");
        System.out.println("------------------------------------------------------------------------");
        Queue<String> ITTickets = new LinkedList<>();

        ITTickets.add("Ticket 1: Patrick George - Ticket created at 10:34 AM");
        ITTickets.add("Ticket 2: Devri Owen - Ticket created at 10:52 AM");
        ITTickets.add("Ticket 3: Frank Allen - Ticket created at 11:03 AM");
        ITTickets.add("Ticket 4: Peter Jackson - Ticket created at 11:17 AM");
        ITTickets.add("Ticket 5: Walt Jones - Ticket created at 12:33 PM");

        ITTickets.forEach(word -> {
            System.out.print(word + " ");
        });

        // Tree
        System.out.println("\n\n\nTreeSet Example. Tree Sets have their values sorted from least to greatest," +
                " in this case in alphabetical order. This is a great use for financial databases, where you" +
                "may need the option to sort amounts from highest to lowest and vice versa.");
        System.out.println("------------------------------------------------------------------------");
        TreeSet ratings = new TreeSet();
        ratings.add("Better");
        ratings.add("Worse");
        ratings.add("Best");
        ratings.add("Worst");
        Iterator list = ratings.iterator();
        while(list.hasNext()) {
            Object rating = list.next();
            System.out.print(rating + "\n");
        }

    }
}
