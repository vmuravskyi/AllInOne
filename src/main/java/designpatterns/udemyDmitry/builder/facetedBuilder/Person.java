package designpatterns.udemyDmitry.builder.facetedBuilder;

class Person {
    // address
    public String streetAddress, postcode, city;

    // employment
    public String companyName, position;
    public int annualIncome;

    @Override
    public String toString() {
        return "Person{" +
                "streetAddress='" + streetAddress + '\'' +
                ", postcode='" + postcode + '\'' +
                ", city='" + city + '\'' +
                ", companyName='" + companyName + '\'' +
                ", position='" + position + '\'' +
                ", annualIncome=" + annualIncome +
                '}';
    }
}

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


// subBuilder
class PersonAddressBuilder extends PersonBuilder {

    public PersonAddressBuilder(Person person) {
        this.person = person;
    }

    public PersonAddressBuilder at(String streetAddress) {
        person.streetAddress = streetAddress;
        return this;
    }

    public PersonAddressBuilder withPostcode(String postcode) {
        person.postcode = postcode;
        return this;
    }

    public PersonAddressBuilder in(String city) {
        person.city = city;
        return this;
    }
}

class PersonJobBuilder extends PersonBuilder {

    public PersonJobBuilder(Person person) {
        this.person = person;
    }

    public PersonJobBuilder at(String companyName) {
        person.companyName = companyName;
        return this;
    }

    public PersonJobBuilder asA(String position) {
        person.position = position;
        return this;
    }

    public PersonJobBuilder earning(int annualIncome) {
        person.annualIncome = annualIncome;
        return this;
    }
}

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
