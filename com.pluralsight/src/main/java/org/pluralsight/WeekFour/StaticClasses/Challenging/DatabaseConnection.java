package org.pluralsight.WeekFour.StaticClasses.Challenging;

public class DatabaseConnection {
    private static Object instance;
    public DatabaseConnection() {}
    public void getInstance() {
        if(instance == null) {
            instance = new Object();
        }
    }
}
