package Generics;

/**
 * Created by User on 02.08.2016.
 */
public class oneGeneric<T> {
    private T val;

    public oneGeneric(T arg){
        val = arg;
    }

    public T getVal() {
        return val;
    }

    public void writeType(){
        System.out.println(val.getClass());
    }
}
