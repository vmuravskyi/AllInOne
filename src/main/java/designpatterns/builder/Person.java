package designpatterns.builder;

public class Person {
    public String name;
    public String position;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}

class PersonBuilder<SELF extends PersonBuilder<SELF>> {
    protected Person person = new Person();

    public SELF withName(String name) {
        person.name = name;
        return self();
    }

    public Person build() {
        return person;
    }

    protected SELF self() {
        return (SELF) this;
    }
}

class EmployeeBuilder extends PersonBuilder<EmployeeBuilder> {
    public EmployeeBuilder worksAt(String position) {
        person.position = position;
        return this;
    }

    @Override
    protected EmployeeBuilder self() {
        return this;
    }
}

class DemoPerson {
    public static void main(String[] args) {

        EmployeeBuilder personBuilder = new EmployeeBuilder();
        Person volodymyr = personBuilder
                .withName("Volodymyr")
                .worksAt("Test Automation Engineer")
                .build();
        System.out.println(volodymyr);
    }
}
