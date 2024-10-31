package seminars.first.Shop;

import javax.management.ObjectName;
import java.util.*;

public class Shop {
    private List<Product> products;

    // Геттеры, сеттеры:
    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    // Метод должен вернуть отсортированный по возрастанию по цене список продуктов
    public List<Product> sortProductsByPrice() {
//        Collections.sort(products);
        return null;
    }

    // Метод должен вернуть самый дорогой продукт
    public Product getMostExpensiveProduct() {
//        if(products.isEmpty()){
//            return null;
//        }
//        return Collections.max(products);
        return null;
    }



}