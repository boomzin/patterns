package patterns.structural.bridge.devices;

public interface Device {
    void switchOn();
    void switchOff();
    void powerOnSelfTest();
    int powerUp();
    int powerDown();
    default void makeSound() {
        System.out.println("Beep");
    }
}
