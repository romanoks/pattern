package flyweight.step2;

import flyweight.step1.Shape;

public class Circle implements Shape {
    private String color;
    private int x;
    private int y;
    private int radius;

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public Circle(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Circle: Draw() [Color : " + color + ", x : " + x + ", y :" + y + ", radius :" + radius);
    }
}