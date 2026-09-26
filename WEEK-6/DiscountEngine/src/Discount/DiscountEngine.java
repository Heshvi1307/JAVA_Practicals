package Discount;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DiscountEngine {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Double> prices = new ArrayList<>();

        System.out.println("===== DISCOUNT ENGINE =====");

        System.out.print("How many prices do you want to enter? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.print("Enter price " + (i + 1) + ": ");
            double price = sc.nextDouble();

            prices.add(price);
        }

        System.out.println("\nPrices entered:");

        for (double price : prices) {
            System.out.println("Rs." + price);
        }3

        do {

            System.out.println("\n===== DISCOUNT MENU =====");
            System.out.println("1. 10% Discount");
            System.out.println("2. 20% Discount");
            System.out.println("3. Flat Rs.100 Discount");
            System.out.println("4. No Discount");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            DiscountRule rule;

            switch (choice) {

                case 1:
                    rule = DiscountRules.tenPercentDiscount();
                    break;

                case 2:
                    rule = DiscountRules.twentyPercentDiscount();
                    break;

                case 3:
                    rule = DiscountRules.flatHundredDiscount();
                    break;

                case 4:
                    rule = DiscountRules.noDiscount();
                    break;

                case 5:
                    System.out.println("Thank you for using Discount Engine!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    continue;
            }

            System.out.println("\n===== FINAL PRICES =====");

            for (double price : prices) {

                double finalPrice = rule.apply(price);

                System.out.println(
                        "Original Price: Rs." + price +
                                " -> Final Price: Rs." + finalPrice);
            }

            System.out.print("\nDo you want to apply another discount? (yes/no): ");
            String again = sc.next();

            if (again.equalsIgnoreCase("no")) {
                break;
            }

        } while (true);

        System.out.println("\nThank you for using Discount Engine!");

        sc.close();
    }
}