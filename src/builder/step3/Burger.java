package builder.step3;

import builder.step1.Item;
import builder.step1.Packing;
import builder.step2.Wrapper;

public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }
}