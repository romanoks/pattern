package builder.step4;

import builder.step3.ColdDrink;

public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coce";
    }

    @Override
    public float price() {
        return 2.06f;
    }
}