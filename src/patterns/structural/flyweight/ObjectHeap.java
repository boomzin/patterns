package patterns.structural.flyweight;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ObjectHeap {
    private final List<MyObject> myObjects = new ArrayList<>();
    private final Map<String, Integer> typeCount = new HashMap<>();

    public void putObject(int length, Color color, Size size) {
        ObjectType objectType = ObjecyTypeFactory.getObjectType(color, size);
        MyObject myObject = new MyObject(length, objectType);
        String type = size + "-" + color;
        myObjects.add(myObject);
        Integer count = typeCount.get(type);
        if (count == null) {
            count = 0;
        }
        typeCount.put(type, ++count);
    }

    public void getInfo() {
        typeCount.forEach((key, value) -> System.out.println(key + " " + value));
    }
}
