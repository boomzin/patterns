package patterns.creational.builder;

public interface VehicleBuilder {

    void createVehicle();
    void setName(String name);
    void setEngine(String engine);
    void setCapacity(int capacity);
    void setWheel(int wheel);
    void setSpeedMax(int speedMax);
}
