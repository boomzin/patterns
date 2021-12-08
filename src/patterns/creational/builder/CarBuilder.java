package patterns.creational.builder;

public class CarBuilder implements VehicleBuilder {

    private Car car;

    @Override
    public void createVehicle() {
        car = new Car();
    }

    @Override
    public void setName(String name) {
        car.setName(name);
    }

    @Override
    public void setEngine(String engine) {
        car.setEngine(engine);
    }

    @Override
    public void setCapacity(int capacity) {
        car.setCapacity(capacity);
    }

    @Override
    public void setWheel(int wheel) {
        car.setWheel(wheel);
    }

    @Override
    public void setSpeedMax(int speedMax) {
        car.setSpeedMax(speedMax);
    }

    public Car getCar() {
        return car;
    }
}
