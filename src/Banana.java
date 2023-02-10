public class Banana extends Fruits {
    private String vitamin;
    private int weight;

    public Banana(String color, String vitamin, int weight) {
        super(color);
        this.vitamin = vitamin;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Banana{" +
                "vitamin='" + vitamin + '\'' +
                ", weight=" + weight +
                '}';
    }
}
