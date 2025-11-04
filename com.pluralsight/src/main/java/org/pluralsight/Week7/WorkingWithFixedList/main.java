package org.pluralsight.Week7.WorkingWithFixedList;

import java.time.LocalDate;
import java.util.ArrayList;

public class main {
    static void main() {
        FixedList<Integer> numbers = new FixedList<>(3, new ArrayList<>());
        numbers.add(0);
        numbers.add(1);
        numbers.add(2);
        numbers.add(2);

        System.out.println(numbers.getItems().size());

        FixedList<LocalDate> dates = new FixedList<>(2);
        dates.add(LocalDate.now());
        dates.add(LocalDate.now());
//        dates.add(15); // this line should fail

    }
}
