package old.generics.other;

import java.util.ArrayList;
import java.util.List;

public class Example {
    public static void main(String[] args) {

        Container<Camera> cameraContainer = new Container<>();
        Container<Phone> phoneContainer = new Container<>();

        Camera camera = new Camera();

        List<Camera> cameras = new ArrayList<>();
        cameras.add(camera);
        find(cameras, camera);
        find(cameras, new Phone());
    }

    private static <T extends Product> boolean find(List<? extends Product> all, Product p) {
        for (Product sp : all) {
            if (sp.isSameProduct(p)) {
                return true;
            }
        }
        return false;
    }
}
