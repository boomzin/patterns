package patterns.creational.abstractFabric;

public class ModernFabric implements FurnitureFabric{
    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }

    @Override
    public Chair crateChair() {
        return new ModernChair();
    }

    @Override
    public Table createTable() {
        return new ModernTable();
    }
}
