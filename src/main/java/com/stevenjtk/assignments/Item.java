package com.stevenjtk.assignments;

public class Item {
        String item;
        double price;
        int quantity;

        public Item(String item, double price, int quantity) {
            this.item = item;
            this.price = price;
            this.quantity = quantity;
        }

    public double getTotal() {
        return price * quantity;
    }
}
