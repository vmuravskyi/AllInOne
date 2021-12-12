package epam.qaSummer.lesson11;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class ProgramMap {
    public static void main(String[] args) {
        String str = "mama mila ramu ramu mila mama ramu";
        Map<String, Integer> freqMap = new HashMap<>();
        String[] words = str.split(" ");
        for (var word : words) {
            if (!freqMap.containsKey(word))
                freqMap.put(word, 1);
            else
                freqMap.put(word, freqMap.get(word) + 1);
        }
        System.out.println(freqMap);


        Set<String> setMap = new TreeSet<>();
        for (var word: words) {
            setMap.add(word);
        }
        System.out.println(setMap);
    }
}
