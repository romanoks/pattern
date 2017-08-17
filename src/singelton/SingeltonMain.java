package singelton;

public class SingeltonMain {
    public static void main(String [] args) {
        SingleObject objects = SingleObject.getInstance();
        objects.showMessage();
    }
}