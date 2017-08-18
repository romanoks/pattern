package bridge.step4;

import bridge.step1.DrawAPI;
import bridge.step3.Shape;

public class Cicle extends Shape {
    private int x,y,radius;

    public Cicle(int x, int y, int radius, DrawAPI drawAPI){
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void draw() {
        drawAPI.drawCicle(radius, x, y);
    }
}