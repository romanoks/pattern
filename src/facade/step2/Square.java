package facade.step2;

import facade.step1.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square :: draw()");
    }
}