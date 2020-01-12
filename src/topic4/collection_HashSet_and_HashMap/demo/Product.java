package topic4.collection_HashSet_and_HashMap.demo;

import java.util.Objects;

public class Product {
    private String number;
    private String name;
    private int price;

    public Product(String number, String name, int price) {
        this.number = number;
        this.name = name;
        this.price = price;
    }

    public Product(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        return number != null ? number.equals(product.number) : product.number == null;
    }

    @Override
    public int hashCode() {
        return number != null ? number.hashCode() : 0;
    }
}