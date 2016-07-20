package exaple;

import listener.Observe;
import listener.subject;

/**
 * Created by User on 20.07.2016.
 */
public class Cat implements Observe{
    int rick = 1;
    int ras = 2;
    subject sub;

    public Cat(subject sub){
        this.sub = sub;
        sub.registrate(this);

    }

    public Cat() {

    }

    @Override
    public void update(int data1, int data2) {
        rick = data1;
        ras = data2;
        print();
    }

    public void print() {
        System.out.println("Cat observer rick:"+rick+" --- ras:"+ras);
    }
}
