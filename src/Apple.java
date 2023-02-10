public class Apple extends Fruits{
    private int weight;
    Banana banana;

    public Apple(String color, int weight, Banana banana) {
        super(color);
        this.weight = weight;
        this.banana = banana;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "weight=" + weight +
                ", banana=" + banana +
                '}';
    }
}
