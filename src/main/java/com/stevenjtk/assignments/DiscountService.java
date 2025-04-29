package com.stevenjtk.assignments;

public class DiscountService {

    interface DiscountInterface {
        double useDiscount (double total);
    }

    static class TenPercentDiscountCalculator implements DiscountInterface {

        @Override
        public double useDiscount(double total) {
            return total = (total * 0.10);
        }
    }

    static class TwentyFivePercentDiscountCalculator implements DiscountInterface {

        public TwentyFivePercentDiscountCalculator(double totalBeforeDiscount) {
        }

        @Override
        public double useDiscount(double total) {
            return total = (total * 0.25);
        }
    }
}
