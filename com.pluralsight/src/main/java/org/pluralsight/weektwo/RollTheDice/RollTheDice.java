package org.pluralsight.weektwo.RollTheDice;

public class RollTheDice {
    static void main() {
        int i = 0;
        int rollOneCounter = 0;
        int rollTwoCounter = 0;
        int[] InterestNumbers = {2,4,6,7};
        int twoCounter = 0;
        int fourCounter = 0;
        int sixCounter = 0;
        int sevenCounter = 0;
        boolean done = false;
        while (i < 100 && !done) {
            if (i == 100) {
                done = true;
            }
            dice roll1 = new dice();
            dice roll2 = new dice();

            int rollOneRandomvalue = roll1.roll(1, 6);
            int rollTwoRandomvalue = roll2.roll(1, 6);

            for (int j = 0; j < InterestNumbers.length; j++) {
                if (rollOneRandomvalue == InterestNumbers[j] || rollTwoRandomvalue == InterestNumbers[j]) {
                    ++i;
                    ++rollOneCounter;
                    int Sum = rollOneRandomvalue + rollTwoRandomvalue;
                    System.out.printf("Count: %d | Roll One: %d - %d Sum: %d\n", i, rollOneRandomvalue, rollTwoRandomvalue, Sum);
                    if(rollOneRandomvalue == 2) {
                        ++twoCounter;
                    }
                    if(rollOneRandomvalue == 4) {
                        ++fourCounter;
                    }
                    if(rollOneRandomvalue == 6) {
                        ++sixCounter;
                    }
                    if(rollOneRandomvalue == 7) {
                        ++sevenCounter;
                    }
                    // 2 part
                    ++rollTwoCounter;
                    int SumTwo = rollOneRandomvalue + rollTwoRandomvalue;
                    System.out.printf("Count: %d | Roll Two: %d - %d Sum: %d\n", i, rollOneRandomvalue, rollTwoRandomvalue, SumTwo);
                    if(rollTwoRandomvalue == 2) {
                        ++twoCounter;
                    }
                    if(rollTwoRandomvalue == 4) {
                        ++fourCounter;
                    }
                    if(rollTwoRandomvalue == 6) {
                        ++sixCounter;
                    }
                    if(rollTwoRandomvalue == 7) {
                        ++sevenCounter;
                    }
                }
            }
        }
        //
        System.out.println("======= RESULTS========");
        System.out.println("Rolled One: " + rollOneCounter + " | " + "Rolled two: " + rollTwoCounter);
        System.out.println("Two Counter: " + twoCounter);
        System.out.println("Four Counter: " + fourCounter);
        System.out.println("Six Counter: " + sixCounter);
        System.out.println("Seven Counter: " + sevenCounter);
    }
}
