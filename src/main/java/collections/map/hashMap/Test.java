package collections.map.hashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Test {
    public static void main(String[] args) {
        // 1 -> [.. .. ..]
        // 2 -> [.. .. ..]

        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Один");
        map.put(2, "Два");
        map.put(4, "Чотири");
        map.put(3, "Три");

        System.out.println(map);
        System.out.println(map.get(2).length());

        TreeMap<Integer,String> map1 = new TreeMap<>(map);

        System.out.println(map1);

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

        System.out.println(map.keySet());
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());
    }
}
