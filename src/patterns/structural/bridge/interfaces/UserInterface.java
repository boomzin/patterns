package patterns.structural.bridge.interfaces;

import patterns.structural.bridge.devices.Device;

public class UserInterface implements ControlInterface {
    protected Device device;

    public UserInterface() {
    }

    public UserInterface(Device device) {
        this.device = device;
    }

    @Override
    public void powerUp() {
        device.powerUp();
    }

    @Override
    public void powerDown() {
        device.powerDown();
    }

    @Override
    public void powerOn() {
        device.switchOn();
    }

    @Override
    public void powerOf() {
        while (device.powerDown() > 1) {
            System.out.println(device.powerDown());
        }
        device.switchOff();
    }
}
