package design_patterns.design_patterns_other.other.builder.builderDone;

public class BuilderLunchOrderDemo {

    public static void main(String[] args) {

        LunchOrder myOrder = LunchOrder.Builder
            .newBuilder()
            .withDressing("dressing")
            .withBread("grey bread")
            .withCondiments("some condiments")
            .withMeat("chicken")
            .build();

        System.out.println(myOrder.getBread());
        System.out.println(myOrder.getCondiments());
        System.out.println(myOrder.getDressing());
        System.out.println(myOrder.getMeat());
    }
}
