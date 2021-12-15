package patterns.structural.composite;

public class Application {

    public static void main(String[] args) {
        Box boxMain = new Box();
        Box box1 = new Box();
        Box box2 = new Box();
        Box box3 = new Box();

        Product apple = new Food(11, 120);
        Product watermelon = new Food(1, 90);
        Product bread = new Food(1, 12);
        Product butter = new Food(11, 240);

        Product vacuumCleaner = new Goods(12000, 36);
        Product fan = new Goods(1300, 12);
        Product cup = new Goods(100, 6);

        box1.add(apple);
        box1.add(apple);
        box1.add(apple);
        box2.add(box1);
        box2.add(watermelon);
        box2.add(bread);
        box2.add(butter);
        box3.add(vacuumCleaner);
        box3.add(fan);
        boxMain.add(box2);
        boxMain.add(box3);
        boxMain.add(cup);
        System.out.println(boxMain.getPrice());

    }
}
