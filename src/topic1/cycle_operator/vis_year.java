package topic1.cycle_operator;

import java.util.Scanner;

public class vis_year {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        String value = "";
        while (true) {

            System.out.println("Введите год для подсчета кол-ва дней");
            value = scan.nextLine();
            int year = Integer.parseInt(value);
            if (year % 400 != 0 && year % 100 != 0) {
                if (year % 4 == 0) {
                    System.out.println("В году 366 дней");
                } else {
                    System.out.println("В году 365 дней");
                }
            } else if (year % 400 == 0) {
                System.out.println("В году 366 дней");
            } else if (year % 100 == 0) {
                System.out.println("В году 365 дней");
            } else {
                if ("end".equals(value)) {
                    System.out.println("Программа завершена!");
                    break;
                }
            }

        }
    }
}
