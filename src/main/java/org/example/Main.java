package org.example;

public class Main {
    public static void main(String[] args) {
        VendingMachine ven1 = new VendingMachine(10);
        ven1.add(new Product("Bonaqua", 100));
        ven1.add(new Product("M&M", 70));
        ven1.add(new Product("Cola", 85));
        ven1.add(new Product("OrangeJuice", 50));
        ven1.add(new Product("Snack", 60));

        try {
            System.out.println(ven1.getProductByName("Bonaqua"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}