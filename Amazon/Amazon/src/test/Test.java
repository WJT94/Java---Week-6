package test;

import customer.*;
import payment.*;
import product.*;

public class Test {
    public static void main(String[] args) {
        Customer customerObj = new Customer();
        Product productObj = new Product();
        Payment paymentObj = new Payment();
        
        customerObj.show();
        productObj.showProduct();
        paymentObj.showPayment();
    }
}
