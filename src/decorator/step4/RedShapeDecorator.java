package decorator.step4;

import decorator.step1.Shape;
import decorator.step3_decorator.ShapeDecarator;

public class RedShapeDecorator extends ShapeDecarator {
    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder (decoratedShape);
    }

    private void setRedBorder(Shape decotatedShape) {
        System.out.println("Border color: red");
    }
}