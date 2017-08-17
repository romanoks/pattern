package builder.step4;

import builder.step3.Burger;

public class ChikenBurger extends Burger{

    @Override
    public String name() {
        return "Chiken Burger";
    }

    @Override
    public float price() {
        return 5.05f;
    }
}