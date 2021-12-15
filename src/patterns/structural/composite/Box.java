package patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Box implements Product{
    private List<Product> productList = new ArrayList<>();

    public void add(Product product) {
        productList.add(product);
    }

    public boolean remove(Product product) {
        return productList.remove(product);
    }

    @Override
    public int getPrice() {
        return productList.stream().mapToInt(Product::getPrice).sum();
    }
}
