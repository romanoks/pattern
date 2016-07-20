package stratage;

/**
 * Created by User on 20.07.2016.
 */
public class FlyAndQuack implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Fly Quack-quack!!!");
    }
}
