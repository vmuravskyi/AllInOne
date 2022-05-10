package design_patterns.design_patterns__and_solid_principles.creational.builder;

public class PersonRestDtoBuilder implements PersonDtoBuilder {
    private String name;
    private int age;
    private int height;
    private double weight;
    private PersonRestDto dto;


    @Override
    public PersonDtoBuilder withName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public PersonDtoBuilder withAge(int age) {
        this.age = age;
        return this;
    }

    @Override
    public PersonDtoBuilder withHeight(int height) {
        this.height = height;
        return this;
    }

    @Override
    public PersonDtoBuilder withWeight(double weight) {
        this.weight = weight;
        return this;
    }

    @Override
    public PersonDto build() {
        dto = new PersonRestDto(name, age, height, weight);
        return dto;
    }

    @Override
    public PersonDto getPersonDto() {
        if (dto != null) {
            return dto;
        } else throw new NullPointerException("Object PersonRestDto has not been built");
    }

    public PersonRestDto createDtoFromObject(Person person) {
        this
                .withAge(person.getAge())
                .withHeight(person.getHeight())
                .withName(person.getName())
                .withWeight(person.getWeight())
                .build();
        return dto;
    }
}
