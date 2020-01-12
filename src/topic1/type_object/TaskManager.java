package topic1.type_object;
/*Добавить картинку на главный экран приветствия, задача начинается в 15 и заканчивается в 19*/

import java.util.Scanner;

public class TaskManager {
    public static void main(String[] args) {
        Scanner text = new Scanner(System.in);
        System.out.println("Введите название задачи время её выполнения:");
        String input = text.nextLine();
        int startPosion = input.indexOf("начинается в");
        int endPosion = input.indexOf("заканчивается в");
        String startTimeString = input.substring(startPosion + 12, startPosion + 15);
        startTimeString = startTimeString.trim();
        //System.out.println(startTimeString);

        String endTimeString = input.substring(endPosion + 15, endPosion + 18);
        endTimeString = endTimeString.trim();
        //System.out.println(endTimeString);
        int diff = Integer.parseInt(endTimeString) - Integer.parseInt(startTimeString);
        // System.out.println(diff);
        if (diff < 0) {
            System.out.println("Формат введеных данных не верный!!!");
        } else {
            System.out.println("На задачу потребуется: " + diff + " ч.");
        }
    }
}
