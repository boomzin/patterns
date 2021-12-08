package patterns.creational.abstractFabric;

public class ClassicTable implements Table{
    @Override
    public void aboutMe() {
        System.out.println("classic table");
    }
}
