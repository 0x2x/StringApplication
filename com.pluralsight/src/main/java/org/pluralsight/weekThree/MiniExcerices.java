package org.pluralsight.weekThree;

import java.util.ArrayList;

public class MiniExcerices {
    static void main() {
        Friends();
        Numbers();
    }

    private static void Friends() {
        /*
            - create a new list with 5 friends
            - add a new friend
            - remove the friend on index 2
            - loop though all the friend and print the vlaue
            //

         */
        ArrayList<String> MyFriends = new ArrayList<>();
        MyFriends.add("John Gotti");
        MyFriends.add("Al Pacino");
        MyFriends.add("pablo escobar");
        MyFriends.add("Al Capone");
        MyFriends.add("Nigel");

        MyFriends.remove(2);
        for (int i = 0; i < MyFriends.size(); i++) {
            System.out.println(MyFriends.get(i));
        }
    }
    private static void Numbers() {
        /*
        - create a new list with 10 members

         */
        ArrayList<Integer> NumbersList = new ArrayList<>();
        NumbersList.add(1);
        NumbersList.add(2);
        NumbersList.add(3);
        NumbersList.add(4);
        NumbersList.add(5);
        NumbersList.add(6);
        NumbersList.add(7);
        NumbersList.add(8);
        NumbersList.add(9);
        NumbersList.add(10);
        int Total = 0;
        int DoubleNewValues = 0;
        for (int i = 0; i < NumbersList.size(); i++) {
            Total += NumbersList.get(i);
            DoubleNewValues += NumbersList.get(i) * 2;
        }
        System.out.println("x2 New values: " + DoubleNewValues);
        System.out.println("New values: " + Total);
    }
}
