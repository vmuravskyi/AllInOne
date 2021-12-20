package Design_Patterns.creational.builder;

import java.io.FileNotFoundException;

public class PersonTest {

    public static void main(String[] args) throws FileNotFoundException {

        Person person = new Person("Volodymyr", 30, 186, 95.1);

        PersonRestDtoBuilder builder = new PersonRestDtoBuilder();
        PersonRestDto personDto = builder.createDtoFromObject(person);

        System.out.println(personDto);
    }

}
