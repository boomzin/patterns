package patterns.structural.decorator;

import patterns.structural.decorator.component.Beep;
import patterns.structural.decorator.component.Clack;
import patterns.structural.decorator.wrapper.DoubleSound;
import patterns.structural.decorator.wrapper.TripleSound;

public class Application {
    public static void main(String[] args) {
        Beep beep = new Beep();
        Clack clack = new Clack();
        DoubleSound doubleSound = new DoubleSound(beep);
        TripleSound tripleSound = new TripleSound(clack);
        doubleSound.makeSound();
        tripleSound.makeSound();
    }
}
