package patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ObjecyTypeFactory {
    static Map<String, ObjectType> objectTypeMap = new HashMap<>();

    public static ObjectType getObjectType(Color color, Size size) {
        String type = size.toString() + "-" + color.toString();
        ObjectType result = objectTypeMap.get(type);
        if (result == null) {
            result = new ObjectType(color, size);
            objectTypeMap.put(type, result);
        }
        return result;
    }
}
