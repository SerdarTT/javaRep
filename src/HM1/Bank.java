package HM1;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    public static void main(String[] args) {

        List<Customer> myCustomers = new ArrayList<>();
        Customer c1 = new Customer("John", 23323223, "New York");
        myCustomers.add(c1);
        Customer c2 = new Customer("David", 34565566, "New Rochelle");
        myCustomers.add(c2);
        c2.savingAccount("Saving Account", 223334667);
        c2.makeDeposit(50000);
        c2.custSummary();

        System.out.println(" ");


        c1.savingAccount("Saving Account", 444555566);
        c1.checkingAccount("Checking Account", 88877655);
        c1.accountNum(23456);
        c1.makeDeposit(1500); //When amount is increased or decreased output changes
        c1.withDraw(525);
        c1.custSummary();
        System.out.println("Number of the customers: "+myCustomers.size());

    }



}
