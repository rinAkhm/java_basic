package topic1.type_object;

import java.util.Scanner;
import java.util.regex.Pattern;

public class DeleteProb {
    public static void main(String[] args) {
        Scanner text = new Scanner(System.in);
        System.out.println("Введите текст:");
        String input = text.nextLine();
        String result = extraTrim(input);
        System.out.println(result);
        //System.out.println(input.replaceAll("\\s+", " ").trim());
    }
    static String extraTrim(String input){
        String result = input.replaceAll("\\s+", " ").trim();
        return result;
    }

}


