package com.stevenjtk.assignments;

public class Main {
    public static void main(String[] args) {

        Item firstItem = new Item("Laptop", 1000.00, 1);
        Item secondItem = new Item("Phone", 500.00, 1);

        double totalBeforeDiscount = calculateTotalPrice(firstItem, secondItem);
        System.out.println("Total before discount is: $" + totalBeforeDiscount);

        DiscountService.TwentyFivePercentDiscountCalculator totalAfterDiscount = new DiscountService.TwentyFivePercentDiscountCalculator(totalBeforeDiscount);

        System.out.println("Total after discount is: $" + totalAfterDiscount);
    }

    public static double calculateTotalPrice(Item item, Item items) {
        double total = 0;
        for (Item item : items) { // Can't figure this bit
            total += item.getTotal();
        }

        return total;
    }
}
