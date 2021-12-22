package designpatterns.design_patterns_udemy.builder.facetedBuilder;

class Demo {

    public static void main(String[] args) {

        Person me = new PersonBuilder()
                .lives()
                .at("Striiiska street")
                .withPostcode("82100")
                .in("Drohobych")
                .works()
                .at("SoftServe")
                .earning(1000)
                .asA("Test Automation Engineer")
                .build();

        System.out.println(me);

    }
}
