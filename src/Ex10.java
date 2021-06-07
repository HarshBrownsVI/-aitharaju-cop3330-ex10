/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Sriharsha Aitharaju
 */
public class Ex10  {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int quantity1,quantity2,quantity3;
        int price1,price2,price3;
        double subtotal;
        System.out.print("Enter the price of item 1");
        price1 = kb.nextInt();
        System.out.print("Enter the quantity of item 1:");
        quantity1 = kb.nextInt();

        System.out.print("Enter the price of item 2");
        price2 = kb.nextInt();
        System.out.print("Enter the quantity of item 2:");
        quantity2 = kb.nextInt();

        System.out.print("Enter the price of item 3");
        price3 = kb.nextInt();
        System.out.print("Enter the quantity of item 3:");
        quantity3 = kb.nextInt();

        subtotal = (price1 * quantity1) + (price2 * quantity2) + (price3 * quantity3);
        double tax = .055 * subtotal;
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Tax: $" + tax);
        System.out.println("Total: $" + (subtotal + tax));

    }
}