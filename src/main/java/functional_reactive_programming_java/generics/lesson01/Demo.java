package functional_reactive_programming_java.generics.lesson01;

public class Demo {
    public static void main(String[] args) {

        Data<String> d1 = new Data<>("This is data1");

        System.out.println(d1);

        Data<Integer> d2 = new Data<>(2);
        System.out.println(d2);

        IData<String> d3 = new Data<>("We have implemented a generic interface");
        System.out.println(d3.getT());


        // subclassing

        Data<String> d4 = new Data<>("data 4");
        BaseData<String> b1 = d4;
        System.out.println(d4);
        System.out.println(b1);


    }


}
