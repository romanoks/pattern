package prototype.step2;

import bridge.step2_bridge.GreenCicle;
import prototype.step1.Shape;

public class Circle extends Shape {
    public Circle(int i, int i1, int i2, GreenCicle greenCicle){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}