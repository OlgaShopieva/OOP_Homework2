package org.example;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {

    private List<Product> list = new ArrayList<>();
    private int maxCapacity;

    public VendingMachine(List<Product> list, int maxCapacity) {
        this.list = list;
        this.maxCapacity = maxCapacity;
    }
    public VendingMachine(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public void add(Product product){
        if(list.size() < maxCapacity) {
            list.add(product);
        }
        else {
            System.out.println("Извините, автомат полный");
        }
    }

    public Product getProductByName(String name) throws Exception {
        for (Product product:list){
            if(product.getName().equals(name)){
                return product;
            }
        }
        throw new Exception("Такой продукт не найден");

    }

    public Product getProductByPrice(double price) throws Exception {
        for (Product product:list){
            if(product.getPrice() == price){
                return product;
            }
        }
        throw new Exception("Такой продукт не найден");
    }
}
