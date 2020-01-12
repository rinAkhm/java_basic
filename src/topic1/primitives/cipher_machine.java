package topic1.primitives;
/*Нужно написать программу декодирования символов из восьмеричного ASCII кода. Для перевода таких смоволов
можно воспользоваться таблицей символов http://www.asciitable.com (восьмеричный код Oct). Пользователь вводит
восьмеричный код символа, который, далее декодируется в букву.*/
import java.util.Scanner;

public class cipher_machine {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        String input = "";
        String result = "";
        //Цикл который будет работать пока не написать "end"
        System.out.println("Вводите ASCII код через enter (end для вывода результата):");
        while (!"end".equals(input)) {
            input = scan.nextLine();
            if ("end".equals(input)) {
                System.out.println("Результат:" + result);
                break;
            }

            char number8x = (char) Integer.parseInt(input, 8);
            String line = Character.toString(number8x);
            result += line;
         //   System.out.println("Результат:" + result);
        }
    }

}

