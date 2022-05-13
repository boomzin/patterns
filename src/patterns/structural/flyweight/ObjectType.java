package patterns.structural.flyweight;

public class ObjectType {
    private final Color color;
    private final Size size;

    public ObjectType(Color color, Size size) {
        this.color = color;
        this.size = size;
    }
}
