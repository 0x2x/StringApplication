package org.pluralsight.weektwo.CalculatorWithMethods;

public class Format {
    static void main() {
        String formattedName = formatName("Nigel", "Davey");
        System.out.println(formattedName);

    }

    private static String formatName(String first, String last) {
        return last + first;
    }
}
