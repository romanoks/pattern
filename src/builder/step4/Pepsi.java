package builder.step4;

import builder.step3.ColdDrink;

public class Pepsi extends ColdDrink{
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 2.01f;
    }
}