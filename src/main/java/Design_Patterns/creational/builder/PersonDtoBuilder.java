package Design_Patterns.creational.builder;

public interface PersonDtoBuilder {

    public PersonDtoBuilder withName(String name);
    public PersonDtoBuilder withAge(int age);
    public PersonDtoBuilder withHeight(int height);
    public PersonDtoBuilder withWeight(double weigth);
    public PersonDto build();
    public PersonDto getPersonDto();

}
