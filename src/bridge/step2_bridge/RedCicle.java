package bridge.step2_bridge;

import bridge.step1.DrawAPI;

public class RedCicle implements DrawAPI {
    @Override
    public void drawCicle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: " + radius + ", x: " + x + ", " + y + "]");
    }
}