package bridge.step2_bridge;

import bridge.step1.DrawAPI;

public class GreenCicle implements DrawAPI {
    @Override
    public void drawCicle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: " + radius + ", x: " + x + ", " + y + "]");
    }
}