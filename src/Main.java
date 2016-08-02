import Generics.doubleObjectClass;
import Generics.oneGeneric;
import Generics.universalMethod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        oneGeneric<Integer> variable = new oneGeneric<>(10);
        System.out.println(variable.getVal());
        variable.writeType();
        doubleObjectClass<Double, String> variable2 = new doubleObjectClass<>(3.65, "Varify");
        variable2.setVal1(3.23);
        variable2.setVal2("Production");
        System.out.println(variable2.toString());

        universalMethod.addJinList(list, "Tractor");
        universalMethod.printListWithType(list);
        universalMethod.addJinList(list,"Production");
        universalMethod.printListWithType(list);
        universalMethod.addValueToList(map, "Generic",42);
        System.out.println(map.get("Generic"));

        System.out.println("Hello World!");
    }
}
