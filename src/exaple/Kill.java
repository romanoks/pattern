package exaple;

import listener.Observe;
import listener.subject;

import java.util.ArrayList;

/**
 * Created by User on 20.07.2016.
 */
public class Kill implements subject {

    ArrayList<Observe> arr;

    public Kill(){
      arr = new ArrayList<>();
    }

    @Override
    public void registrate(Observe o) {
        arr.add(o);
    }

    @Override
    public void remove(Observe o) {
        arr.remove(o);

    }

    @Override
    public void notifyObservers(int a, int b) {
        for (Observe o : arr) {
            o.update(a,b);
        }
    }
}
