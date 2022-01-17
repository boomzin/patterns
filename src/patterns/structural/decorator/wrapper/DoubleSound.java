package patterns.structural.decorator.wrapper;

import patterns.structural.decorator.component.SoundMaker;

public class DoubleSound extends BaseWrapper {

    public DoubleSound(SoundMaker soundMaker) {
        super(soundMaker);
    }

    @Override
    public void makeSound() {
        super.makeSound();
        super.makeSound();
    }
}
