package week4;

import javax.accessibility.AccessibleAction;

public class Ex72 {
    public static void main(String[] args) {

        Account a = new Account("A", 100);
        Account b = new Account("B", 0);
        Account c = new Account("C", 50);

        transfer(a, b, 50);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
    public static void transfer(Account from, Account to, double amount){
        from.withdrawal(amount);
        to.deposit(amount);
    }
}
