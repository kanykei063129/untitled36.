import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("BMW");
        Car car = new Car(vehicle.name, "Black",312);
        System.out.println(car);

        car.carSpead();
        car.price();
        vehicle.myMethod();
    }
}