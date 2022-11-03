package days54;

public class AccountTest {

    public static void main(String[] args) {

        Account acc1 = new Account();
        acc1.setAcc_no(12334556677L);
        acc1.setName("Ayse");
        acc1.setEmail("aysehanim@gmail.com");
        acc1.setAmount(250000.50);
        System.out.println(acc1.getAcc_no()+" "+acc1.getName()+" "+acc1.getEmail()+" "+acc1.getAmount());

    }
}
