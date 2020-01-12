package topic4.collection_queue.polski;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вводите выражение для перевода в обратную польскую запись (вводить нужно через пробел)");
        String str = scanner.nextLine();
        String[] strings = str.split(" ");
        Deque<String> sign = new ArrayDeque<>();
        //Stack<String> sign = new Stack<>();
        Queue<Integer> numbers = new ArrayDeque<>();
        for (int i = 0; i < strings.length; i++) {
            if (isNumber(strings[i])) {
                numbers.add(Integer.valueOf(strings[i]));
            } else {
                sign.add(strings[i]);
            }
        }
        System.out.println("Полученное выражение: ");
        while (!numbers.isEmpty()) {
            Integer x = numbers.poll();
            System.out.printf("%d ", x);
        }
        while (!sign.isEmpty()) {
            String y = sign.pollLast();
            System.out.printf("%s", y);
        }
    }

    private static boolean isNumber(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
