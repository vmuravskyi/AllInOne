package tim_buchalka_java_programming_masterclass.section_10_generics;

public abstract class Player {

    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
