package patterns.creational.builder;

public class Plane {
    private String name;
    private String engine;
    private int capacity;
    private int wheel;
    private int speedMax;
    private String Weapon;

    public void setWeapon(String weapon) {
        Weapon = weapon;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

    public void setSpeedMax(int speedMax) {
        this.speedMax = speedMax;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "name='" + name + '\'' +
                ", engine='" + engine + '\'' +
                ", capacity=" + capacity +
                ", wheel=" + wheel +
                ", speedMax=" + speedMax +
                ", Weapon='" + Weapon + '\'' +
                '}';
    }
}
