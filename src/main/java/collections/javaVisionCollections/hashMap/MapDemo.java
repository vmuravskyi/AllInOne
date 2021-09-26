package collections.javaVisionCollections.hashMap;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("a", "b");
        map.put("d", "e");
        map.put("b", "d");
        map.put("a", "c");

        System.out.println(map.get("a"));
        System.out.println(map.containsValue("d"));
        System.out.println(map.size());


        System.out.println(map.remove("a"));
        System.out.println(map.containsKey("a"));



    }
}
