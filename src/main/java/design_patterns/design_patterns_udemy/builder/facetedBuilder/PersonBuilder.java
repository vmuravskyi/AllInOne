package design_patterns.design_patterns_udemy.builder.facetedBuilder;

// builder facade
class PersonBuilder {
    protected Person person = new Person();

    public PersonAddressBuilder lives() {
        return new PersonAddressBuilder(person);
    }

    public PersonJobBuilder works() {
        return new PersonJobBuilder(person);
    }

    public Person build() {
        return person;
    }
}
