package customer;

import product.Product;

public class Customer {
    public String userName;
    public String address;
    public String email;
    public String password;
    public String phone;
    
    public void showProfile() {
        System.out.println(String.format("Name: %s", this.userName));
        System.out.println(String.format("Email: %s", this.email));
        System.out.println(String.format("Address: %s", this.address));
        System.out.println(String.format("Phone: %s", this.phone));
    }

    public void editProfile() {

    }

    public void changePassword() {

    }

    public void checkOrderStatus() {

    }

    public void returnAndRefund() {

    }

    public void placeOrder() {

    }

    public void cancelOrder() {

    }

    public void addToCard() {

    }

    public void show() {
        System.out.println("Hello, customers!");
    }
}
