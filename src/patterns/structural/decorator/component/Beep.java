package patterns.structural.decorator.component;

public class Beep implements SoundMaker{
    @Override
    public void makeSound() {
        System.out.println("Beep");
    }
}
