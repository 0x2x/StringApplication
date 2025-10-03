package org.pluralsight.weektwo.RollTheDice;

public class RollTheDice {
    static void main() {
        int rollTwoResults = 0;
        int rollOneResults = 0;

        int i = 0;
        int rollOneCounter = 0;
        int rollTwoCounter = 0;
        int[] InterestNumbers = {2,4,6,7};
        int twoCounter = 0;
        int fourCounter = 0;
        int sixCounter = 0;
        int sevenCounter = 0;
        while (i < 100) {
            dice roll1 = new dice();
            roll1.roll(1, 6);

            dice roll2 = new dice();
            roll2.roll(1, 6);

            int rollOneRandomvalue = roll1.getRandomNumber();
            int rollTwoRandomvalue = roll2.getRandomNumber();

            for (int j = 0; j < InterestNumbers.length; j++) {
                if (rollOneRandomvalue == InterestNumbers[j]) {
                    ++i;
                    ++rollOneCounter;
                    int Sum = rollOneRandomvalue + rollTwoRandomvalue;
                    System.out.printf("Roll %d: %d - %d Sum: %d\n", i, rollOneRandomvalue, rollTwoRandomvalue, Sum);
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
                }
                if (rollTwoRandomvalue == InterestNumbers[j]) {
                    ++rollOneCounter;
                    int Sum = rollOneRandomvalue + rollTwoRandomvalue;
                    System.out.printf("Roll %d: %d - %d Sum: %d\n", i, rollOneRandomvalue, rollTwoRandomvalue, Sum);
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
        System.out.println("Two Counter: " + twoCounter);
        System.out.println("Four Counter: " + fourCounter);
        System.out.println("Six Counter: " + sixCounter);
        System.out.println("Seven Counter: " + sevenCounter);

    }
}
