package builder.step6_builder;

import builder.step4.ChikenBurger;
import builder.step4.Coke;
import builder.step4.Pepsi;
import builder.step4.VegBurger;
import builder.step5.Meal;

public class MealBuilder {
    public Meal prepareVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChikenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}