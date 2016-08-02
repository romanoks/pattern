package Generics;

import java.util.List;
import java.util.Map;

/**
 * Created by User on 02.08.2016.
 */
public class universalMethod {

    public static <T> void printListWithType(List<T> list){
        for (T arg: list) {
            System.out.println(arg.toString());
        }
    }

    public static <K, V> void addValueToList (Map<K,V> map, K val, V val2){
        map.put(val, val2);
    }

    public static <T> void addJinList(List<T> list, T val){
        list.add(val);
    }
}
