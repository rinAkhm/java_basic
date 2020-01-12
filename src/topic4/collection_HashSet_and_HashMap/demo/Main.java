package topic4.collection_HashSet_and_HashMap.demo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Storage storage1 = new Storage("Первый склад","Горького,45");
        Storage storage2 = new Storage("Второй склад","Герцена,45");

        Product milk = new Product("123", "Простоквашино", 60);
        Product tea = new Product("456", "Чай майский", 100);
        Product tomato = new Product("78", "ПОмидоры", 150);

        Map<Storage, Map<Product,Integer>> storageMap1 = new HashMap<>();
        HashMap<Product, Integer> productMap1 = new HashMap<>();
        productMap1.put(milk, 20);
        productMap1.put(tea, 10);
        productMap1.put(tomato, 20);

        HashMap<Product, Integer> productMap2 = new HashMap<>();
        productMap2.put(tomato, 10);


        storageMap1.put(storage1, productMap1);
        storageMap1.put(storage2, productMap2);

        searchProduct(storageMap1, "78");

    }

    static void searchProduct(Map<Storage, Map<Product,Integer>> map, String serialNo) {
        for (Storage s : map.keySet()) {
            Map<Product, Integer> productMap = map.get(s);
            //System.out.println(s);
            Integer amount = productMap.get(new Product(serialNo));
            if (amount != null) {
                System.out.println("На складе " + s.getName() + " найдено " + amount + " единиц товара");
            }
        }

    }
}