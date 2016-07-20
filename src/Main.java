import exaple.Cat;
import exaple.Dog;
import exaple.Kill;
import exaple.mouse;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Kill kill = new Kill();
        Dog dog = new Dog(kill);
        Cat cat = new Cat(kill);
        Cat cat2 = new Cat();
        mouse mou = new mouse();

        dog.print();
        cat.print();
        cat2.print();
        mou.print();
        kill.notifyObservers(3,4);
        kill.notifyObservers(8,9);
    }
}
