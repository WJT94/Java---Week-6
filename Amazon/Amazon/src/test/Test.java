package test;

import customer.*;
import payment.*;
import product.*;

public class Test {
    public static void main(String[] args) {
        Customer cust1 = new Customer();
        cust1.userName = "Will";
        cust1.email = "will@gmail.com";
        cust1.address = "123 Address Road, Town, UK AB12 3CD";
        cust1.phone = "1234567890";

        cust1.showProfile();
    }
}
