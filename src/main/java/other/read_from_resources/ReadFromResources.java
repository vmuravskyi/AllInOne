package other.read_from_resources;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class ReadFromResources {

    public static void main(String[] args) {

        List<String> txtFile = readTxt();
        System.out.println(txtFile);

    }

    private static List<String> readTxt() {
        List<String> collect;
        try {
            URL url = ReadFromResources.class.getClassLoader().getResource("txt/Books.txt");
            File file = new File(Objects.requireNonNull(url).getFile());
            collect = Files.lines(file.toPath()).collect(Collectors.toList());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return collect;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public HashMap<String, Object> main() {
        return new HashMap<String, Object>();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

}
