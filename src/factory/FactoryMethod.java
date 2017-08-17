package factory;

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