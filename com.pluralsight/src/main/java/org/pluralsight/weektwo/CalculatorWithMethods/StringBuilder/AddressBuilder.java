package org.pluralsight.weektwo.CalculatorWithMethods.StringBuilder;

import java.net.Socket;
import java.util.HashMap;
import java.util.Scanner;

public class AddressBuilder {

    static void main() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Whats your name:");
        String Name = scan.nextLine();

        StringBuilder Address = AddressBuilderFunc(scan);
        StringBuilder ShippingAddress = ShippingAddress(scan);


        System.out.println();
        System.out.println("======Billing & Shipping Details======");
        System.out.println(Name);
        System.out.println("Billing Address: ");
        System.out.println(Address.toString());
        System.out.println();
        System.out.println("Shipping Address: ");
        System.out.println(ShippingAddress.toString());

    }

    private static StringBuilder AddressBuilderFunc(Scanner scan) {
        StringBuilder AddressBuilderStr = new StringBuilder();

        System.out.print("\nBilling Street: ");
        String BillingAddress = scan.nextLine();

        System.out.print("\nBilling City: ");
        String BillingCity = scan.nextLine();

        System.out.print("\nBilling State: ");
        String BillingState = scan.nextLine();

        System.out.print("\nBilling Zip: ");
        String BillingZip = scan.nextLine();

        AddressBuilderStr.append(BillingAddress);
        AddressBuilderStr.append("\n").append(BillingCity);
        AddressBuilderStr.append(", ").append(BillingState);
        AddressBuilderStr.append(" ").append(BillingZip);
        return AddressBuilderStr;
    }

    private static StringBuilder ShippingAddress(Scanner scan) {
        StringBuilder ShippingAddressBuilder = new StringBuilder();

        System.out.print("\nShipping Street: ");
        String ShippingAddress = scan.nextLine();

        System.out.print("\nShipping City: ");
        String ShippingCity = scan.nextLine();

        System.out.print("\nShipping State: ");
        String ShippingState = scan.nextLine();

        System.out.print("\nShipping Zip: ");
        String ShippingZip = scan.nextLine();

        ShippingAddressBuilder.append(ShippingAddress);
        ShippingAddressBuilder.append("\n").append(ShippingCity);
        ShippingAddressBuilder.append(", ").append(ShippingState);
        ShippingAddressBuilder.append(" ").append(ShippingZip);

        return ShippingAddressBuilder;
    }

}
