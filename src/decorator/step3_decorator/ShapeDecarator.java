package decorator.step3_decorator;

import decorator.step1.Shape;

public abstract class ShapeDecarator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecarator (Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    public void draw() {
        decoratedShape.draw();
    }
}