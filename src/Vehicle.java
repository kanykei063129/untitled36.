public class Vehicle {
    String name;

    public Vehicle(String name) {
        this.name = name;
    }

    public void myMethod() {
        System.out.println("Tuut, tuut!");
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                '}';
    }
}
