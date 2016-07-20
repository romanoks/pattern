package Example;

import stratage.FlyBehavior;
import stratage.QuackBehavior;

/**
 * Created by User on 20.07.2016.
 */
public class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }


}
