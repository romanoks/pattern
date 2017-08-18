package bridge.step3;

import bridge.step1.DrawAPI;

public abstract class Shape {
    protected DrawAPI drawAPI;

    protected Shape (DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}