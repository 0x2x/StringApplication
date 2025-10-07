package org.pluralsight.weekThree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class SearchEngineLogger {
    private String CurrentQuery;

    void main() {
        Scanner scan = new Scanner(System.in);
        Event("launch");
        while (true) {
            ConsolePrefix();
            String GoogleSearch = scan.nextLine();
            if(GoogleSearch.equalsIgnoreCase("x")) {
                Event("exit");
                System.exit(0);

            }
            String GooglePrefixReplace = String.format("https://www.google.com/search?q=%s&oq=%s", GoogleSearch.replace(" ", "%20"), GoogleSearch.replace(" ", "%20"));
            System.out.printf("\t Google Result: %s\n", GooglePrefixReplace);
            this.CurrentQuery = GoogleSearch;
            Event("search");
        }
    }

    static void ConsolePrefix() {
        LocalDate localDate = LocalDate.now();
        System.out.printf("%s search [X to exit]: ", localDate);
    }

    void Event(String Event) {
        LocalDate userDate = LocalDate.now();
        LocalTime userTime = LocalTime.now();

        DateTimeFormatter formatter;
        DateTimeFormatter formatterTime;

        formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        formatterTime = DateTimeFormatter.ofPattern("HH:mm:ss");

        String date = userDate.format(formatter);
        String time = userTime.format(formatterTime);
        //2023-09-05 12:52:20
        //yyyy-MM-dd

        switch (Event) {
            case "launch":
                WriteFile("logs.txt", String.format("%s %s: %s", date, time, "launch"));
                break;
            case "search":
                WriteFile("logs.txt", String.format("%s %s Searched : %s", date, time, this.CurrentQuery));
                break;
            case "exit":
                WriteFile("logs.txt", String.format("%s %s: %s", date, time, "exit"));
                break;
        }
    }

    static void WriteFile(String path, String text) {
        try {
            FileWriter fileWriter = new FileWriter(path, true);
            BufferedWriter bufWriter = new BufferedWriter(fileWriter);
            bufWriter.write(text + "\n");
            bufWriter.close();
            }catch (Exception e) {
                System.out.printf("Error Occured");
            }
        }
}

