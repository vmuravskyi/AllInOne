package designPatterns.builder.builderDone;

public class BuilderLunchOrderDemo {
    public static void main(String[] args) {
        LunchOrder lunchOrder = new LunchOrder.Builder()
                .meat("курка")
                .condiments("часник")
                .dressing("цезар")
                .bread("білий")
                .build();

        System.out.println(lunchOrder.getBread());
        System.out.println(lunchOrder.getCondiments());
        System.out.println(lunchOrder.getDressing());
        System.out.println(lunchOrder.getMeat());
    }
}
