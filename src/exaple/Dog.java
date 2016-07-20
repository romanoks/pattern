package exaple;

import listener.Observe;
import listener.subject;

import javax.security.auth.Subject;

/**
 * Created by User on 20.07.2016.
 */
public class Dog implements Observe {
    int beta = 1;
    int alfa = 2;
    subject sub;
    public Dog(subject sub){
        this.sub = sub;
        sub.registrate(this);
    }

    public Dog() {

    }

    @Override
    public void update(int data1, int data2) {
        this.alfa = data1;
        this.beta = data2;
        print();
    }

    public void print() {
        System.out.println("Dog alfa:"+alfa+"-- beta:"+beta);
    }
}
