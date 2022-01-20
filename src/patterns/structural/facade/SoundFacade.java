package patterns.structural.facade;

import patterns.structural.decorator.component.Beep;
import patterns.structural.decorator.component.Clack;
import patterns.structural.decorator.wrapper.DoubleSound;
import patterns.structural.decorator.wrapper.TripleSound;

public class SoundFacade {

    public void doubleClack() {
        Clack clack = new Clack();
        DoubleSound doubleSound = new DoubleSound(clack);
        doubleSound.makeSound();
    }

    public void tripleBeep() {
        Beep beep = new Beep();
        TripleSound tripleSound = new TripleSound(beep);
        tripleSound.makeSound();
    }
}
