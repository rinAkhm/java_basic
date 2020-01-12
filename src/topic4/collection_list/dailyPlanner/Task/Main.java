package topic4.collection_list.dailyPlanner.Task;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String inputList = "";
        String inputTask = "";
        String deleteIndex = "";
        String[] taskList = new String[]{"1. Добавить задачу", "2. Вывести список задач", "3. Удалить задачу", "0. Выход"};
        Scanner scanner = new Scanner(System.in);
        Task tasks = new Task();
        while (true) {
            System.out.println();
            System.out.println("Выберите действие:");
            for (String task : taskList) {
                System.out.printf("%s\n", task);
            }
            inputTask = scanner.nextLine();
            if ("0".equals(inputTask)) {
                System.out.println("Программа завершена!");
                break;
            }
            int result = 0;
            switch (inputTask) {
                case "1":
                    while (true) {
                        System.out.println("Введите название задачи (для завершения введите end)");
                        inputList = scanner.nextLine();
                        tasks.addTask(inputList);
                        if ("end".equals(inputList)) {
                            tasks.list.remove("end");
                            break;
                        }
                    }
                case "2":
                    System.out.println("Все ваши задачи");
                    tasks.getTask();
                    break;
                case "3":
                    while (true) {
                        System.out.println("Введите номер задачи, что бы её удалить или end для выхода");
                        deleteIndex = scanner.nextLine();
                        if ("end".equals(deleteIndex)) {
                            System.out.println("Список актуальных задач:");
                            for (String a:tasks.list) {
                                System.out.printf("%d. %s",a);
                            }
                            //tasks.getTask();
                            break;
                        }
                        try {
                            result = Integer.parseInt(deleteIndex);
                            tasks.deleteTask(result);
                        } catch (NumberFormatException e) {
                            System.out.println("нужно вводить числа");
                        }
                    }
            }
        }
    }
}



