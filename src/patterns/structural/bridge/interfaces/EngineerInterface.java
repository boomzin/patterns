package patterns.structural.bridge.interfaces;

import patterns.structural.bridge.devices.Device;

public class EngineerInterface implements ControlInterface {
    protected Device device;

    public EngineerInterface() {
    }

    public EngineerInterface(Device device) {
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
        device.powerOnSelfTest();
    }

    @Override
    public void powerOf() {
        while (device.powerDown() > 1) {
            System.out.println(device.powerDown());
        }
        device.switchOff();
    }

    public void reset() {
        while (device.powerDown() > 1) {
            device.powerOnSelfTest();
        }
        device.switchOff();
        device.switchOn();
        device.powerOnSelfTest();
    }

    public void urgentStop() {
        device.switchOff();
    }
}
