package topic2.array.two_arrays;

public class Product implements Comparable <Product>{
    String name;
    int price;
    String description;

    public Product(int price, String name, String description){
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int compareTo(Product o) {
        return o.price-this.price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "price='" + getPrice() + '\'' +
                ", name=" + getName() +
                ", description='" + getDescription() + '\'' +
                '}';
    }
}






