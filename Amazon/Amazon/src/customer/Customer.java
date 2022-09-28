package customer;

import product.Product;

public class Customer {
    String name;
    String address;
    String phone;
    Product[] cart;

    public static Customer createNew() {
        Customer cus = new Customer();


        return cus;
    }
    
    public void initialize(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public void show() {
        System.out.println("Hello, customers!");
    }
}
