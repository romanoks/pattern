package facade.step2;

import facade.step1.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle :: draw()");
    }
}