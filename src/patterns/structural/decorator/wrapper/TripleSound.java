package patterns.structural.decorator.wrapper;

import patterns.structural.decorator.component.SoundMaker;

public class TripleSound extends BaseWrapper {
    public TripleSound(SoundMaker soundMaker) {
        super(soundMaker);
    }

    @Override
    public void makeSound() {
        super.makeSound();
        super.makeSound();
        super.makeSound();
    }
}
