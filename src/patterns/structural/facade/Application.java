package patterns.structural.facade;

public class Application {
    public static void main(String[] args) {
        SoundFacade soundFacade = new SoundFacade();
        soundFacade.doubleClack();
        soundFacade.tripleBeep();
    }
}
