package topic2.array.two_arrays;

import java.util.Scanner;


class BuyProduct {
    public static void main(String[] args) {
        Scanner text = new Scanner(System.in);
        String input = "";
        String[] products = new String[]{"Хлеб", "Молоко", "Яблоко"};
        int[] prices = new int[]{20, 60, 15};
        //int[] id = new int[3]{1,2,3};

        System.out.println("Список товаров");
        for (int i = 0; i < products.length; i++) {
            System.out.printf("%d.\t%s\t%d руб.\t\n", i + 1, products[i], prices[i]);
        }
        Basket[] product = new Basket[5];
        int counter = 0;
        //int result = 0;
        int sum=0;
        while (true) {
            System.out.println("Введите номер продукта и количество через пробел или введите end для выхода");
            input = text.nextLine();
            if ("end".equals(input) || counter == 5) {
                System.out.println("В Вашей корзине:");

                for (int i = 0; i < counter; i++) {
                    product[i].formatPrint();
                }
                System.out.printf("Итого: %d руб.", sum);
                System.out.println();
                break;
            }
            //int sum=0;
            int id = 0;
            int kol = 0;
            String[] substrings = input.split(" ");
            try {
                id = Integer.parseInt(substrings[0]);
            } catch (NumberFormatException e) {
                System.out.println("Введите номер товара используя целые числа");
            }
            try {
                kol = Integer.parseInt(substrings[1]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Введите количество товара - целое число ");
            } catch (NumberFormatException e) {
                System.out.println("Введите количество товара - целое число ");
            }
            if (id > 0 && kol > 0 && id <= products.length) {
                String currentProduct = products[id - 1];
                int currentPrice = prices[id - 1];
                sum += currentPrice * kol;
                Basket buy = new Basket(currentProduct, currentPrice, kol);
                product[counter] = buy;
                counter += 1;
            } else {
                System.out.println("Данного товара нет");
            }
        }
    }
}






