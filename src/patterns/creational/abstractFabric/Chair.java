package patterns.creational.abstractFabric;

public interface Chair{
    default void aboutMe() {
        System.out.println("chair");
    }
}
