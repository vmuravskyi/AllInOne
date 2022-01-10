package functional_reactive_programming_java.section09.builder;

public class BuilderDemo {

    public static void main(String[] args) {

        MobileBuilder builder = new MobileBuilder();
        Mobile mobile = builder.with(mobileBuilder -> {
            mobileBuilder.ram = 4;
            mobileBuilder.battery = 4000;
            mobileBuilder.camera = 12;
            mobileBuilder.processor = "M1 PRO";
            mobileBuilder.storage = 2000;
            mobileBuilder.screenSize = 13.3;
        }).createMobile();

        System.out.println(mobile);

    }
}
