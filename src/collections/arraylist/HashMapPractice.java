package collections.arraylist;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<String, String> exampleMap = new HashMap<>(15, 0.9F);

        exampleMap.put("Apple", "Green");
        exampleMap.put("Grapes", "Blue");

        System.out.println("exampleMap + " + exampleMap);

        HashMap<String, String> example1Map = new HashMap<>(exampleMap);
        example1Map.put("fdjfd", "jhgjhg");
        example1Map.put("dsds", "fsfs");
        System.out.println("example1Map initial + " + example1Map);


        example1Map.put("Apple", "fsfd");
        System.out.println("example1Map after put same key + " + example1Map);

        example1Map.putIfAbsent("Grapes", "khjgg");
        example1Map.putIfAbsent("Grapes1", "3245khjgg");
        System.out.println("example1Map after putIfAbsent + " + example1Map);

        System.out.println(example1Map.get("Grapes2"));

        for (String key : example1Map.keySet()) {
            example1Map.get(key);
        }

        Iterator iterator = example1Map.keySet().iterator();
        while (iterator.hasNext()) {
            String value = (String) iterator.next();
        }


    }
}
