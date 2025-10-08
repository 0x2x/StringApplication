package org.pluralsight.weekThree;

import java.util.ArrayList;
import java.util.List;

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
        List<String> myFriendsOne = new ArrayList<>();
        myFriendsOne.add("John Gotti");
        myFriendsOne.add("Al Pacino");
        myFriendsOne.add("pablo escobar");
        myFriendsOne.add("Al Capone");
        myFriendsOne.add("Nigel");

        myFriendsOne.remove(2);
        for (int i = 0; i < myFriendsOne.size(); i++) {
            System.out.println(myFriendsOne.get(i));
        }
        //
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
        List<Integer> NumbersListOne = new ArrayList<>();
        NumbersListOne.add(1);
        NumbersListOne.add(2);
        NumbersListOne.add(3);
        NumbersListOne.add(4);
        NumbersListOne.add(5);
        NumbersListOne.add(6);
        NumbersListOne.add(7);
        NumbersListOne.add(8);
        NumbersListOne.add(9);
        NumbersListOne.add(10);
        int TotalOne = 0;
        int DoubleNewValuesOne = 0;
        for (int i = 0; i < NumbersListOne.size(); i++) {
            TotalOne += NumbersListOne.get(i);
            DoubleNewValuesOne += NumbersListOne.get(i) * 2;
        }
        System.out.println("x2 New values: " + DoubleNewValuesOne);
        System.out.println("New values: " + TotalOne);
        //
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
