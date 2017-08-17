package builder.step3;

import builder.step1.Item;
import builder.step1.Packing;
import builder.step2.Bottle;

public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }
}