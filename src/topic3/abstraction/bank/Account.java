package topic3.abstraction.bank;

public abstract class Account {
    protected String number;
    protected double balance;

    public Account(String number) {
        this.number = number;
    }

    public Account(String number, double balance) {
        this.number = number;
        this.balance = balance;
    }


    abstract void pay (double amount);
    abstract boolean addMoney(double amount);
    abstract void transfer(Account account, double amount);


    protected boolean enoughMoney(double amount) {
        if (amount > balance){
            return false;
        }else{
            return true;
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
