package days46_Review;

import java.util.ArrayList;

public class Bank {

    String name;
    String address;
    ArrayList<Customer> customers = new ArrayList<Customer>();


    public void addCustomer(Customer customer) {
        customers.add(customer);

    }

    public Bank(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void showCustomers() {
        System.out.println(this.name);
        System.out.println("Address ...: " + this.address);
        System.out.println();

        for (Customer customer: customers){
            System.out.println("Customer name");
            System.out.println("-------------");
            System.out.println(customer.getName());
            System.out.println("..................");
            customer.showMyAcconut();
            System.out.println("..................");
        }
    }
}
