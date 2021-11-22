package generics;

public class Camera extends Product<Camera> {
    int pixels;

    public int getPixels() {
        return pixels;
    }

    public void setPixels(int pixels) {
        this.pixels = pixels;
    }

    @Override
    void subCompare(Camera c) {

    }
}
