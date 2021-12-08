package patterns.creational.abstractFabric;

public class ClassicChair implements Chair{
    @Override
    public void aboutMe() {
        System.out.println("classic chair");
    }
}
