package patterns.structural.composite;

public class Food implements Product {
    private int expirationMonth;
    private int price;

    public Food(int expirationMonth, int price) {
        this.expirationMonth = expirationMonth;
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
