package builder.step4;

import builder.step3.Burger;

public class VegBurger extends Burger {
    @Override
    public String name() {
        return "VegBurger";
    }

    @Override
    public float price() {
        return 3.9f;
    }
}