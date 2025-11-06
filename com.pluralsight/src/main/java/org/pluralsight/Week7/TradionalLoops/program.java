package org.pluralsight.Week7.TradionalLoops;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class program {
    static void main() {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Jamey", "Orozco", 15));
        people.add(new Person("Charity", "jeff", 61));
        people.add(new Person("Jayson", "Skinner", 21));
        people.add(new Person("Ronda", "Hunter", 42));
        people.add(new Person("Garland", "BlankenShip", 63));
        people.add(new Person("Luke", "Ayers", 75));
        people.add(new Person("Ella", "Drake", 12));
        people.add(new Person("Lessie", "Doyle", 16));
        people.add(new Person("Alex", "Buck", 20));
        people.add(new Person("Hollis", "Pam", 19));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name (first or last): ");
        String searchName = scanner.nextLine();
        ArrayList<Person> results = new ArrayList<>();
        for (Person value : people) {
            if (value.getFirstName().equalsIgnoreCase(searchName) || value.getLastName().equalsIgnoreCase(searchName)) {
                results.add(value);
            }
        }
        System.out.println("==Results==");
        AtomicInteger index = new AtomicInteger(1);
        results.forEach(person -> {
            System.out.println( index.getAndIncrement()+ " | " +  person.getFirstName() + " | " +  person.getLastName() + " | " + person.getAge());
        });
    }
}
