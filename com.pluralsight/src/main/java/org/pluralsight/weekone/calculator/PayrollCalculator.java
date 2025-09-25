package org.pluralsight.weekone.calculator;

import java.util.Scanner;

public class PayrollCalculator {
    static void main() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Whats your name: ");
        String UserName = scan.next();
        System.out.print("Whats your hours worked: ");

        float HoursWorked = scan.nextFloat();
        System.out.print("Whats your payrate: ");

        float PayRate = scan.nextFloat();
        System.out.println();

        if (HoursWorked >= 40) {
            float GrossPay = (PayRate * HoursWorked );
            float multiPly = GrossPay * 1.5f;

            System.out.printf("%s gross-pay is %f with 1.5x increase.\n", UserName, multiPly);
            System.out.printf("%s gross-pay with out 1.5 increase is %f\n", UserName, GrossPay);
        } else {
            float GrossPay = PayRate * HoursWorked;
            System.out.printf("%s gross-pay is %s\n", UserName, GrossPay);

        }

    }
}
