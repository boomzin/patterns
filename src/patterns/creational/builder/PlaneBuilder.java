package patterns.creational.builder;

public class PlaneBuilder implements VehicleBuilder {

    private Plane plane;

    @Override
    public void createVehicle() {
        plane = new Plane();
    }

    @Override
    public void setName(String name) {
        plane.setName(name);
    }

    @Override
    public void setEngine(String engine) {
        plane.setEngine(engine);
    }

    @Override
    public void setCapacity(int capacity) {
        plane.setCapacity(capacity);
    }

    @Override
    public void setWheel(int wheel) {
        plane.setWheel(wheel);
    }

    @Override
    public void setSpeedMax(int speedMax) {
        plane.setSpeedMax(speedMax);
    }

    public void setWeapon(String weapon) {
        plane.setWeapon(weapon);
    }

    public Plane getPlane() {
        return plane;
    }
}
