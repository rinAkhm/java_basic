package topic2.array.two_arrays;

public class Basket {
    String name;
    int prices;
    int amount;


    public Basket(String name, int prices, int amount) {
        this.name = name;
        this.prices = prices;
        this.amount = amount;
    }

    public void formatPrint() {
        //System.out.println("\tНаименовние \tцена за 1 ед.");
        System.out.printf("%s\t%d руб.\t %d штук.\t%d руб.\t\n", name, prices, amount, totalSum(amount, prices));
    }

    public int totalSum(int amount, int prices) {
        int sum=0;
        sum += this.amount*this.prices;
        return sum;
    }
}


