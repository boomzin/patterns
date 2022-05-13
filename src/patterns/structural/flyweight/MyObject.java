package patterns.structural.flyweight;

public class MyObject {
    int length;
    ObjectType objectType;

    public MyObject(int length, ObjectType objectType) {
        this.length = length;
        this.objectType = objectType;
    }
}
