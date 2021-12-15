package patterns.structural.composite;

public class Goods implements Product{
    int price;
    int warranty;

    public Goods(int price, int warranty) {
        this.price = price;
        this.warranty = warranty;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
