package patterns.structural.bridge.devices;

public class Washer implements Device {
    boolean isOkState = true;
    int power = 0;

    @Override
    public void switchOn() {
        System.out.println("Washer is power on");
        power = 1;
    }

    @Override
    public void switchOff() {
        makeSound();
        makeSound();
        System.out.println("Washer is power off");
        power = 0;
    }

    @Override
    public void powerOnSelfTest() {
        System.out.println("Washer power on self-test");
        if (isOkState) {
            makeSound();
        } else {
            makeSound();
            makeSound();
            makeSound();
        }
    }

    @Override
    public int powerUp() {
        makeSound();
        System.out.println("Washer is power up");
        return ++power;
    }

    @Override
    public int powerDown() {
        System.out.println("Washer is power down");
        return --power;
    }
}
