package topic3.abstraction.bank;

public class Main {
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount("11 22 33 44 55", 10000);
        SavingsAccount savingsAccount = new SavingsAccount("123 123 123", 100000);
        CreditAccount creditAccount = new CreditAccount("111 23232", 0);

        checkingAccount.pay(10);
        savingsAccount.pay(10);
        creditAccount.pay(10);
        System.out.println();
        checkingAccount.addMoney(100);
        savingsAccount.addMoney(100);
        creditAccount.addMoney(100);
        System.out.println();
        creditAccount.transfer(savingsAccount, 1010);
        savingsAccount.transfer(checkingAccount,1111);

    }
}
