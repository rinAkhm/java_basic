package topic4.collection_list.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        ArrayList<Integer> arrayList2 = new ArrayList<>();
        ArrayList<Double> arrayList3 = new ArrayList<>();
        ArrayList<Long> arrayList4 = new ArrayList<>();

        arrayList.add("Line1");
        arrayList.add("Line2");

        arrayList2.add(1);

        System.out.println(arrayList.isEmpty());
        System.out.println(arrayList.size());
        System.out.println(arrayList.indexOf("Line2"));
        arrayList.add("Line3");
        //arrayList.remove("Line2");
        arrayList.remove(0);
        int i = 0;
        for (String line:arrayList) {
            System.out.println(line + " -индекс:" +arrayList.indexOf(line));
            System.out.println("Line " + i);
            i++;
        }
        //arrayList.remove("Line2");
        Iterator it = arrayList.iterator();
        while (it.hasNext()){

            System.out.println(it.next());
            it.remove();
        }
        System.out.println("после удаления, выведет true если пустое");
        System.out.println(arrayList.isEmpty());
    }
}
