package other.read_from_resources;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.util.List;
import java.util.stream.Collectors;

public class ReadFromResources {

    public static void main(String[] args) {

        List<String> collect;
        try {
            URL url = ReadFromResources.class.getClassLoader().getResource("txt/Books.txt");
            File file = new File(url.getFile());
            collect = Files.lines(file.toPath()).collect(Collectors.toList());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(collect);

    }

}
