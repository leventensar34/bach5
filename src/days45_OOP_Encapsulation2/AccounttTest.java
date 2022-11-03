package days45_OOP_Encapsulation2;

public class AccounttTest {


    public static void main(String[] args) {

        Accountt accountt=new Accountt();
        accountt.setAcc_number(1234567890);
        accountt.setName("Hasan");
        accountt.setEmail("hasan@gmail.com");
        accountt.setAmount(45000.00);
        accountt.setPhoneNumber("0675443656");
        accountt.setAddress("10 London Road");

        System.out.println(accountt.toString());
    }
}
