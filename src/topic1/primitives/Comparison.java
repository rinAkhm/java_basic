package topic1.primitives;

import java.util.Scanner;

public class Comparison {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = "";

        while (true) {
            System.out.println("\n Операции над double/float");
            System.out.println("------------------------------------------------------------------------------");
            System.out.println("1. Сравнить\n" +
                    "2. Округлить\n" +
                    "3. Отбросить дробную часть\n" +
                    "4. Выйти");
            System.out.println("------------------------------------------------------------------------------");
            //System.out.println("Выберите один из пунктов:");

            input = scan.nextLine();
            if ("4".equals(input)) {
                System.out.println("Программа завершена");
                break;
            }

            System.out.println("Введите первое число: ");
            double value1 = scan.nextDouble();

            System.out.println("Введите второе число: ");
            double value2 = scan.nextDouble();

            switch (input){
                case "1":{
                    String result = srav(value1,value2);
                    System.out.println(result);
                    break;
                }
                case "2":{
                    round(value1,value2);
                    //System.out.printf("round div = %s %n", Math.round((double) value1 / value2));
                    break;
                }
                case "3":{
                    bros(value1,value2);
                }
            }
        }
       /* System.out.println("Введите первое число: ");
        double value1 = scan.nextDouble();

        System.out.println("Введите второе число: ");
        double value2 = scan.nextDouble();

        switch (input) {
            case "1": {
                String result = srav(value1, value2);
                System.out.println(result);
                break;
            }
            case "2": {
                round(value1, value2);
                //System.out.printf("round div = %s %n", Math.round((double) value1 / value2));
                break;
            }
            case "3": {
                bros(value1, value2);
                break;
            }
        */
    }


    static String srav(double a, double b) {
        double diff = a - b;
        if (diff == 0) {
            return "Числа равны";
        } else if (diff > 0) {
            return "Первое число больше";
        } else {
            return "Второе число больше";
        }
    }
    static void round (double a, double b){
        System.out.println("Первое число:" + Math.round(a));
        System.out.println("Первое число:" + Math.round(b));
    }
    static void bros (double a, double b){
        System.out.println("Первое число:" + (long)Math.round(a));
        System.out.println("Первое число:" + (long)Math.round(b));
    }
}
