package enumExample;

import java.util.Arrays;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        MusicType type = MusicType.CLASSIC;
        System.out.println(type.info());


        MusicType[] enumValuesMas = MusicType.values();
        List<MusicType> musicTypeList = Arrays.asList(enumValuesMas);
        musicTypeList.forEach(System.out::println);
    }
}
