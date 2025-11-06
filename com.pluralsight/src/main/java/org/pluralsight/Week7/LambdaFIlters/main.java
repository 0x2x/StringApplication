package org.pluralsight.Week7.LambdaFIlters;

import java.util.ArrayList;
import java.util.List;
// ex 1

interface IntFilter {
    boolean filter(int number);
}

// ex 2
interface StringFilter {
    boolean filter(String text);
}
public class main {
    static void main() {
        // ex 1
        IntFilter number = (nr1) -> nr1 % 2 == 0;
        List<Integer> newNumbers = new ArrayList<>();
        newNumbers.add(2);
        newNumbers.add(6);
        newNumbers.add(5);
        newNumbers.add(1);
        newNumbers.add(6);


        List<Integer> intFilter = filterNumbers(number, newNumbers);
        System.out.println(intFilter);
        // ex 2
        StringFilter words = (word) -> word.length() > 5 ;
        List<String> newWords = new ArrayList<>();
        newWords.add("java");
        newWords.add("lambdas");
        newWords.add("awesome");
        newWords.add("fun");
        newWords.add("chicken");
        List<String> stringFilter = filterText(words, newWords);
        System.out.println(stringFilter);

    }
    // ex 1
    private static List<Integer> filterNumbers(IntFilter filter, List<Integer> numbers) {
        List<Integer> newNumbers = new ArrayList<>();
        for(int n : numbers) {
            if(filter.filter(n)) {
                newNumbers.add(n);
            }
        }
        return newNumbers;
    }

    private static List<String> filterText(StringFilter filter, List<String> words) {
        List<String> newWords = new ArrayList<>();
        for (String w : words) {
            if(filter.filter(w)) {
                newWords.add(w);
            }
        }
        return newWords;
    }
}
