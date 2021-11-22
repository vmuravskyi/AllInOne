package designPatterns.builder.builderDone;

public class BuilderLunchOrderDemo {

    public static void main(String[] args) {

        LunchOrder myOrder = LunchOrder.Builder
            .newBuilder()
            .withDressing("dressing")
            .withBread("grey bread")
            .withCondiments("some condiments")
            .withMeat("chicken")
            .build();


//        LunchOrder lunchOrder = builder.withMeat("курка")
//            .withCondiments("часник")
//            .withDressing("цезар")
//            .withBread("білий")
//            .build();

        System.out.println(myOrder.getBread());
        System.out.println(myOrder.getCondiments());
        System.out.println(myOrder.getDressing());
        System.out.println(myOrder.getMeat());
    }
}
