package patterns.structural.decorator.wrapper;

import patterns.structural.decorator.component.SoundMaker;

public abstract class BaseWrapper implements SoundMaker {
    private SoundMaker soundMaker;

    public BaseWrapper(SoundMaker soundMaker) {
        this.soundMaker = soundMaker;
    }

    @Override
    public void makeSound() {
        soundMaker.makeSound();
    }
}
