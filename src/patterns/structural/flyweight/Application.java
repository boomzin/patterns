package patterns.structural.flyweight;

import java.util.Random;

public class Application {
    static int OBJECT_TO_HEAP = 1000000;
    static int MAX_OBJECT_LENGTH = 100;
    static Random random = new Random();

    public static void main(String[] args) {
        ObjectHeap objectHeap = new ObjectHeap();
        for (int i = 0; i < OBJECT_TO_HEAP; i++) {
            objectHeap.putObject(random.nextInt(100), randomEnum(Color.class), randomEnum(Size.class));
        }
        objectHeap.getInfo();
    }

    public static <T extends Enum<?>> T randomEnum(Class<T> clazz){
        int x = random.nextInt(clazz.getEnumConstants().length);
        return clazz.getEnumConstants()[x];
    }
}
