package listener;

/**
 * Created by User on 20.07.2016.
 */
public interface subject {
    void registrate(Observe o);
    void remove (Observe o);
    void notifyObservers (int a, int b);

}
