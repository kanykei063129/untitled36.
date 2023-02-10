import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        Banana banana = new Banana("yellow","B6 C",1);
        Apple apple = new Apple("red",2,banana);
        Orange orange = new Orange("Orange",3,banana);
        System.out.println(apple+"\n"+orange+"\n"+banana);
    }
}