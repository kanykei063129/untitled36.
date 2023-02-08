public class Car extends Vehicle{
 String color;
int number;

    public Car(String name,String color, int number) {
        super(name);
        this.color = color;
        this.number = number;
    }

    public void carSpead(){
        System.out.println("Car spead 250 km/h ");
}
public void price(){
    System.out.println("Car price : 20000$");
}

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", number=" + number +
                '}';
    }
}
