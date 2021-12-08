package patterns.creational.builder;

public class Director {
    private VehicleBuilder builder;

    public void setBuilder(VehicleBuilder builder) {
        this.builder = builder;
    }

    public VehicleBuilder getBuilder() {
        return builder;
    }

    public void constructCar() {
        builder.createVehicle();
        builder.setCapacity(5);
        builder.setEngine("1.6 di");
        builder.setName("city car");
        builder.setWheel(4);
        builder.setSpeedMax(180);
    }

    public void constructPlane() {
        builder.createVehicle();
        builder.setCapacity(255);
        builder.setEngine("rolls-royce");
        builder.setName("just plane");
        builder.setWheel(8);
        builder.setSpeedMax(10800);
    }

    public void constructInterceptor() {
        builder.createVehicle();
        builder.setCapacity(1);
        builder.setEngine("rolls-royce");
        builder.setName("hurricane");
        builder.setWheel(3);
        builder.setSpeedMax(5000);
    }

}
