package patterns.creational.abstractFabric;

public interface Table {
    default void aboutMe() {
        System.out.println("table");
    }
}
