package patterns.structural.bridge.devices;

public class VacuumCleaner implements Device {
    boolean isOkState = true;
    int power = 0;

    @Override
    public void switchOn() {
        System.out.println("Vacuum cleaner is power on");
        power = 1;
    }

    @Override
    public void switchOff() {
        System.out.println("Vacuum cleaner is power off");
        power = 0;
    }

    @Override
    public void powerOnSelfTest() {
        System.out.println("Vacuum cleaner power on self-test");
        if (isOkState) {
            makeSound();
        } else {
            makeSound();
            makeSound();
            makeSound();
            makeSound();
        }
    }

    @Override
    public int powerUp() {
        System.out.println("Vacuum cleaner is power up");
        return ++power;
    }

    @Override
    public int powerDown() {
        makeSound();
        System.out.println("Vacuum cleaner is power down");
        return --power;
    }
}
