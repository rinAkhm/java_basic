package topic4.collection_list.dailyPlanner.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Task {
    List<String> list = new ArrayList<>();

    public void addTask(String task) {
        list.add(task);
        if (task.isEmpty()) {
            System.out.println("вы не вели текст задания");
            list.remove("");
        }
    }

    public void deleteTask(int id) {
        try {
            list.remove((id) - 1);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Задачи с таким номером нет");
        }
    }

    public void getTask() {
        int i = 1;
        Iterator<String> taskListIterator = list.iterator();
        while (taskListIterator.hasNext()) {
            String taskName = taskListIterator.next();
            System.out.printf("%d. %s\n", i, taskName);
            i++;
        }
    }
}
