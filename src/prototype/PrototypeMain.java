package prototype;

import prototype.step1.Shape;
import prototype.step3.ShapeCashe;

public class PrototypeMain {
    public static void main(String[] args) {
        ShapeCashe.loadCacheBuilder();

        Shape clonedShape = (Shape) ShapeCashe.getShape("1");
        System.out.println("Shape : " + clonedShape.getType());

        Shape clonedShape2 = (Shape) ShapeCashe.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());

        Shape clonedShape3 = (Shape) ShapeCashe.getShape("3");
        System.out.println("Shape : " + clonedShape3.getType());
    }
}