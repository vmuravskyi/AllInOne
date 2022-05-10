package design_patterns.design_patterns__and_solid_principles.creational.builder;

public interface PersonDtoBuilder {

    public PersonDtoBuilder withName(String name);
    public PersonDtoBuilder withAge(int age);
    public PersonDtoBuilder withHeight(int height);
    public PersonDtoBuilder withWeight(double weigth);
    public PersonDto build();
    public PersonDto getPersonDto();

}
