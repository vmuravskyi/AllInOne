package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsWildcard {
}

/**
 * PECS (Producer extends, Consumer Super)
 */
class Generics2 {

    public void copy (List<? extends Generics1> src, List<? super Generics1> dst) {
        dst.addAll(src);
    }

    public static void main(String[] args) {
        Generics2 g = new Generics2();

        List<F> src = new ArrayList<>();
        src.add(new F());
        src.add(new F());
        src.add(new F());

        List<Generics1> dst = new ArrayList<>();

        g.copy(src, dst);
        System.out.println(dst.size());
    }

}

class Generics1 {}

class F extends Generics1 {}
