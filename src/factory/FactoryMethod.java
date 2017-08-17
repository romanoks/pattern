package factory;

import factory.step1.Shape;
import factory.step2.Rectangle;
import factory.step2.Square;

public class FactoryMethod {
    public Shape getFigure(String fig){
        if(fig.equals("RECTANGLE")){
            return new Rectangle();
        } else if (fig.equals("SQUARE")){
            return new Square();
        }
        return null;
    }

    public static void main(String [] args){
        FactoryMethod fact = new FactoryMethod();
        Shape a = fact.getFigure("RECTANGLE");
        a.draw();
        a = fact.getFigure("SQUARE");
        a.draw();
    }
}