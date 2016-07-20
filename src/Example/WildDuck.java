package Example;

import stratage.FlyAndQuack;
import stratage.QuackOnLake;

/**
 * Created by User on 20.07.2016.
 */
public class WildDuck extends Duck{
    public WildDuck(){
        flyBehavior = new FlyAndQuack();
        quackBehavior = new QuackOnLake();
        performFly();
        performQuack();
    }

}
