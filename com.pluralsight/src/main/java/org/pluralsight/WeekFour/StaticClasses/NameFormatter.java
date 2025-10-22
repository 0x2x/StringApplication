package org.pluralsight.WeekFour.StaticClasses;

public class NameFormatter {
    private String firstName;
    private String lastName;
    private String middleName;
    private String prefix;
    private String suffix;

    // constructor
    public NameFormatter(String firstName, String lastName, String middleName, String prefix, String suffix) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.prefix = prefix;
        this.suffix = suffix;
    }

    // methods

    public static String format(String firstName, String lastName) {
        return lastName + ", " + firstName;
    }

    public static String format(String prefix, String firstName, String middleName, String lastName, String suffix) {
        return String.format("%s %s %s %s, %s", prefix, firstName, middleName, lastName, suffix);
    }


    public static String format(String fullName) {
        return fullName;
    }
}
