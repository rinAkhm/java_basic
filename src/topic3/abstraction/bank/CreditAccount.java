package topic3.abstraction.bank;

public class CreditAccount extends Account{
    public CreditAccount(String number) {
        super(number);
    }

    public CreditAccount(String number, double balance) {
        super(number, balance);
    }

    @Override
    void pay(double amount) {
        balance -=amount;
        System.out.format("Операция заврешена. Перевод %.2f руб. Баланс %.2f руб.\n",amount, balance);
    }

    @Override
    boolean addMoney(double amount) {
        double newBalance = balance + amount;
        if (newBalance>0){
            System.out.format("Не возможно зачислить сумму. Максимальная сумма для зачисления %.2f руб.\n", amount-newBalance);
        return false;
        }else {
            balance +=amount;
            System.out.format("Зачисленно на счет %.2f руб. Баланс %.2f руб.\n", amount,balance);
            return true;
        }
    }

    @Override
    void transfer(Account account, double amount) {
        System.out.println("Операция невозможна с кредитного счета");
    }
}
