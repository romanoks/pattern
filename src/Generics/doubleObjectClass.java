package Generics;

/**
 * Created by User on 02.08.2016.
 */
public class doubleObjectClass<T,K> {
    T val1;
    K val2;
//    public doubleObjectClass(){
//        val1 = null;
//        val2= null;
//    }

    public doubleObjectClass(T one, K two){
        val1 = one;
        val2 = two;
    }

    public T getVal1(){
        return val1;
    }

    public void setVal1(T val1) {
        this.val1 = val1;
    }

    public K getVal2() {
        return val2;
    }

    public void setVal2(K val2) {
        this.val2 = val2;
    }

    @Override
    public String toString() {
        return val1.getClass().toString()+" --- "+val2.getClass().toString();
    }
}
