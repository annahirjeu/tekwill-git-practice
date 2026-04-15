package collections.arraylist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Recap {
    public static void main(String[] args) {
        HashMap<String, String> stringHashMap = new HashMap<>();
        stringHashMap.put("El1", "Va1");
        stringHashMap.put("El2", "Va2");
        stringHashMap.put("El3", "Va3");
        stringHashMap.put("El4", "Va4");
        stringHashMap.put("El5", "Va5");


        Set<String> keySet = stringHashMap.keySet();
        for (String key : keySet) {
            String value = stringHashMap.get(key);
            System.out.println(value);
        }

        Set list = Set.of("Value1", "value2", "value2");

        List<String> strings = new ArrayList<>(list);




    }
}
