package HW1;

import java.util.Scanner;

public class convecter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //int inputCase;
        String result = "";

        while (true) {

            System.out.println("Из какой системы в какую переводим?");
            System.out.println("1. 10 -> 16");
            System.out.println("2. 10 -> 8");
            System.out.println("3. 10 -> 2");
            System.out.println("4. 2 -> 10");
            System.out.println("5. 8 -> 10");
            System.out.println("6. 16 -> 10");
            System.out.println("0. -> для выхода ");
            String inputCase = scan.nextLine();
            if ("0".equals(inputCase)) {
                System.out.println("программа завершена");
                break;
            }
            System.out.println("Введите число для перевода");
            String value = scan.nextLine();
            result = convert(value, inputCase);
            System.out.println(result);
        }
    }

    static String convert( String value, String system){
     //   String result;
        switch (system) {
            case "1": {
                int valueString = Integer.parseInt(value);
                return Integer.toHexString(valueString);
            }
            case "2": {
                int valueString = Integer.parseInt(value);
                return Integer.toOctalString(valueString);
            }
            case "3": {
                int valueString = Integer.parseInt(value);
                return Integer.toBinaryString(valueString);

            }
            case "4": {
                return Integer.valueOf(value, 2).toString();

            }
            case "5": {
                return Integer.valueOf(value, 8).toString();

            }
            case "6": {
                return Integer.valueOf(value, 16).toString();

            }
            default: {
                return "ошибка";
            }
        }
    }
}
