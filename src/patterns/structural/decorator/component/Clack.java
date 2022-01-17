package patterns.structural.decorator.component;

public class Clack implements SoundMaker{
    @Override
    public void makeSound() {
        System.out.println("Clack");
    }
}
