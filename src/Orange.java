public class Orange extends Fruits {
    private int weight;
    Banana banana;

    public Orange(String color, int weight, Banana banana) {
        super(color);
        this.weight = weight;
        this.banana = banana;
    }

    @Override
    public String toString() {
        return "Orange{" +
                "weight=" + weight +
                ", banana=" + banana +
                '}';
    }
}
