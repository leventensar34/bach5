package days46_Review;

import java.util.ArrayList;

public class Customer {
    private String name;
    ArrayList<Account> accounts = new ArrayList<Account>();

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addAccount(Account account){
        accounts.add(account);
    }
    public void showMyAcconut(){
        for (Account account : accounts) {
            System.out.println(account.getName());
            System.out.println("Bakiye = " + account.getBalance());
            System.out.println();
        }
    }
}
