package patterns.structural.bridge;

import patterns.structural.bridge.devices.Device;
import patterns.structural.bridge.devices.VacuumCleaner;
import patterns.structural.bridge.interfaces.EngineerInterface;
import patterns.structural.bridge.interfaces.UserInterface;

public class Application {
    public static void main(String[] args) {
        Device vacuumCleaner = new VacuumCleaner();

        UserInterface userInterface = new UserInterface(vacuumCleaner);
        EngineerInterface engineerInterface = new EngineerInterface(vacuumCleaner);

        userInterface.powerOn();
        System.out.println("-----------");
        engineerInterface.powerOn();
        engineerInterface.reset();
    }
}
