package patterns.creational.abstractFabric;

import java.time.LocalTime;

public class Application {
    private static FurnitureFabric furnitureFabric;

    public static void main(String[] args) {
        if ((LocalTime.now().getSecond() % 2) > 0) {
            furnitureFabric = new ModernFabric();
        }else {
            furnitureFabric = new ClassicFabric();
        }
        Chair chair = furnitureFabric.crateChair();
        Sofa sofa = furnitureFabric.createSofa();
        Table table = furnitureFabric.createTable();
        chair.aboutMe();
        sofa.aboutMe();
        table.aboutMe();
    }
}
