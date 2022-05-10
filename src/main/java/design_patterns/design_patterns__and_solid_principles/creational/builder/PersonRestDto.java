package design_patterns.design_patterns__and_solid_principles.creational.builder;


public class PersonRestDto implements PersonDto {
    private final String name;
    private final int age;
    private final int height;
    private final double weight;

    public PersonRestDto(String name, int age, int height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getAge() {
        return null;
    }

    @Override
    public String getHeight() {
        return null;
    }

    @Override
    public String getWeight() {
        return null;
    }

    @Override
    public String toString() {
        return "PersonRestDto{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
