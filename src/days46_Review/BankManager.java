package days46_Review;

public class BankManager {

    public static void main(String[] args) {

        Bank bank1 = new Bank("EuroStudy Bank", "Germany");
        Customer cust1 = new Customer("Ahmet Falanca");
        Customer cust2 = new Customer("Mehmet Smithson");
        Customer cust3 = new Customer("Ali Can");


//        Account account = new Account("Mevduat hesabi", 100);
//        Account accountdvz = new Account("Doviz hesabi", 1500);

        cust1.addAccount(new Account("Mevduat Hesabi", 100));
        cust1.addAccount(new Account("Doviz Hesabi", 1500));

//        cust1.addAccount(account);
//        cust1.addAccount(accountdvz);
//       // cust1.showMyAcconut();

        cust2.addAccount(new Account("Mevduat Hesabi", 20000));
        cust2.addAccount(new Account("Doviz Hesabi", 9000));

        cust3.addAccount(new Account("Euro Hesabi", 15000));
        cust3.addAccount(new Account("Doviz Hesabi", 100000));


        bank1.addCustomer(cust1);
        bank1.addCustomer(cust2);
        bank1.addCustomer(cust3);
        bank1.showCustomers();




    }
}
