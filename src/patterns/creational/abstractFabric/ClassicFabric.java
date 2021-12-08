package patterns.creational.abstractFabric;

public class ClassicFabric implements FurnitureFabric {
    @Override
    public Sofa createSofa() {
        return new ClassicSofa();
    }

    @Override
    public Chair crateChair() {
        return new ClassicChair();
    }

    @Override
    public Table createTable() {
        return new ClassicTable();
    }
}
