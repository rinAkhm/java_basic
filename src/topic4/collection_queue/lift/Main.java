package topic4.collection_queue.lift;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String addNumberMsg = "Ожидаю ввода этажа от 0 до 25: (для завершения введите 0)";
        String choiceFloor = "";
        int currentFloor = 0;
        int waitDoorsInSeconds = 10;
        int waitMoveInSeconds = 5;
        int totalSeconds = 0;
        int previouseFloor = -1;
        Scanner scanner = new Scanner(System.in);
        Deque<Integer> queue = new ArrayDeque<>();
        Queue<Integer> time = new PriorityQueue<>();
        while (true) {
            System.out.println(addNumberMsg);
            choiceFloor = scanner.nextLine().trim();
            try {
                currentFloor = Integer.parseInt(choiceFloor);
                if (currentFloor > 25 || currentFloor < 0) {
                    System.out.println("Такого этажа нет в доме");
                    continue;
                }
                queue.add(currentFloor);
                if (0 == currentFloor) {
                    System.out.println("Вы приехали");
                    queue.remove(0);
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Ошибка при вводе");
            }
            if (previouseFloor != -1) {
                totalSeconds += Math.abs(currentFloor - previouseFloor) * waitMoveInSeconds;
                totalSeconds += waitDoorsInSeconds;
                time.add(totalSeconds);
                previouseFloor = currentFloor;
            } else {
                previouseFloor = 0;
            }
        }
        while (!queue.isEmpty()) {
            Integer floor = queue.poll();
            System.out.printf("Этаж =:\t%d\n", floor);
        }
        while (!time.isEmpty()) {
            Integer x = time.poll();
            System.out.printf("Время в пути: %d", x);
        }
    }
}

