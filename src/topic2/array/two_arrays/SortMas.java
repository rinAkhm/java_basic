package topic2.array.two_arrays;

import java.util.Arrays;

public class SortMas {
    public static void main(String[] args) {
        Product[] products = new Product[3];
        Product pen = new Product(15, "Pen", "made of China");
        Product phone = new Product(60000, "iphone x", "black");
        Product picture = new Product(1000, "Maleevich Square", "Copy");

        pen.setPrice(20);
        pen.setName("Pen");
        pen.setDescription("made of USA");

        products[0] = pen;
        products[1] = phone;
        products[2] = picture;


        Arrays.sort(products);
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i]);
        }
    }
}
