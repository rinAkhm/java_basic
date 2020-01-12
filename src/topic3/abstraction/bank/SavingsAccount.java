package topic3.abstraction.bank;

public class SavingsAccount extends Account {

    public SavingsAccount(String number, double balance) {
        super(number, balance);
    }

    @Override
    void pay(double amount) {
        System.out.println("Платеж не доступен со сберегательного счета");
    }

    @Override
    boolean addMoney(double amount) {
        balance+=amount;
        System.out.format("Баланс пополнен на сумму рублей %.2f руб. Текущий баланс счета %.2f руб.\n",amount,balance ) ;
        return true;
    }

    @Override
    void transfer(Account account, double amount) {
        if (account != null) {
            if (enoughMoney(amount)){
                balance -= amount;
                if(account.addMoney(amount)){
                    System.out.format("Успешно. Перевод %.2f руб. Баланс %.2f руб.\n",amount, balance);
                }else {
                    balance +=amount;
                    System.out.format("Отказано. Перевод %.2f руб. Баланс %.2f руб.\n",amount, balance);
                }
            } else {
                System.out.format("Не достаточно денежных средств для завершения операция перевода. Перевод %.2f руб. Баланс %.2f руб.\n",amount, balance);
            }
        }else{
            System.out.println("Не известный счет");
        }
    }

}
