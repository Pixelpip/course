
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        Account a= new Account("Matthews account", 1000);
        Account b=new Account("My account", 0);
        a.withdrawal(100.0);
        b.deposit(100.0);
        System.out.println(a);
        System.out.println(b);
    }
}
