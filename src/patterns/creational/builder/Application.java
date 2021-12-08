package patterns.creational.builder;

public class Application {
    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder carBuilder = new CarBuilder();
        director.setBuilder(carBuilder);
        director.constructCar();
        Car car  = carBuilder.getCar();
        System.out.println(car);

        PlaneBuilder planeBuilder = new PlaneBuilder();
        director.setBuilder(planeBuilder);
        director.constructPlane();
        Plane plane = planeBuilder.getPlane();
        plane.setWeapon("");
        System.out.println(plane);
        director.constructInterceptor();
        Plane interceptor = planeBuilder.getPlane();
        interceptor.setWeapon("missile");
        System.out.println(interceptor);

    }
}
