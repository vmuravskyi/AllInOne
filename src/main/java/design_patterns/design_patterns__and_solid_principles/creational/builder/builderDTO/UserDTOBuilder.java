package design_patterns.design_patterns__and_solid_principles.creational.builder.builderDTO;

import java.time.LocalDate;

//Abstract builderDTO
public interface UserDTOBuilder {
    //methods to build "parts" of product at a time
    UserDTOBuilder withFirstName(String fname);

    UserDTOBuilder withLastName(String lname);

    UserDTOBuilder withBirthday(LocalDate date);

    UserDTOBuilder withAddress(Address address);

    //method to "assemble" final product
    UserDTO build();

    //(optional) method to fetch already built object
    UserDTO getUserDTO();
}

