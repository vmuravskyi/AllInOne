package softserve.wrapperGerericsComparableList;

import java.util.Arrays;
import java.util.List;

public class ApplBox {
    public static void main(String[] args) {

        BoxWrapper box = new BoxWrapper();

       // box.set(123); // int -> Integer

        box.set("123");

        System.out.println(box.get());

        String[] mas = {"123", "abc", "rerger", "1"};

        List<String> list = Arrays.asList(mas);

        list.sort((o1, o2) -> o1.compareTo(o2));
        System.out.println(list);

    }
}
