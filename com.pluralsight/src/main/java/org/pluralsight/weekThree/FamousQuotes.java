package org.pluralsight.weekThree;

import java.util.ArrayList;
import java.util.Scanner;

public class FamousQuotes {
    static void main() {
        ArrayList<String> Quotes = new ArrayList<>();
        Quotes.add("\"The unexamined life is not worth living.\"");
        Quotes.add("\"It is never too late to be what you might have been.\" — George Eliot ");
        Quotes.add("\"Life is 10% what happens to you and 90% how you react to it.\" — Charles R. Swindoll ");
        Quotes.add("\"All our dreams can come true, if we have the courage to pursue them.\" — Walt Disney \n");
        Quotes.add("\"A journey of a thousand miles begins with a single step.\" — Lao Tzu ");
        Quotes.add("\"Believe you can and you're halfway there.\" — Theodore Roosevelt ");
        Quotes.add("\"The only thing we have to fear is fear itself.\" — Franklin D. Roosevelt ");
        Quotes.add("The mind is everything. What you think you become.\" — Buddha ");
        Quotes.add("\"Wherever you are, be all there.\" — Jim Elliot");
        Quotes.add("\"The saddest thing in life is wasted talent\" - Robert De Niro (the Bronx tale)");

        Scanner scan = new Scanner(System.in);

        do {
            System.out.println();
            System.out.printf("Choose a number between 1 and %d", Quotes.size());
            System.out.print("\nNumber: ");
            String NumberChoice = scan.nextLine();
            try {
                if (NumberChoice.equalsIgnoreCase("random")) {
                    int RandomOption = (int) Math.round(Math.random() * Quotes.size());
                    String QuoteResult = Quotes.get(RandomOption);
                    System.out.println("Result: " + QuoteResult);

                } else {
                    if (Integer.parseInt(NumberChoice) > Quotes.size()) {
                        System.out.println("Invalid number");
                    } else {
                        String QuoteResult = Quotes.get(Integer.parseInt(NumberChoice) - 1);
                        System.out.println("Result: " + QuoteResult);

                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("You have to use numbers, can't use letters.");
            }

        } while (true);


    }
}