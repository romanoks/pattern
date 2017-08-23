package bridge;

import bridge.step2_bridge.GreenCicle;
import bridge.step2_bridge.RedCicle;
import bridge.step3.Shape;
import bridge.step4.Cicle;

public class BridgeMain {
    public static void main(String[] args) {
        Shape redCircle = new Cicle(100,100, 10, new RedCicle());
        Shape greenCircle = new Cicle(100,100, 10, new GreenCicle());

        redCircle.draw();
        greenCircle.draw();
    }
}