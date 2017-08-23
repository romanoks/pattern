package facade.step2;

import facade.step1.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle :: draw()");
    }
}