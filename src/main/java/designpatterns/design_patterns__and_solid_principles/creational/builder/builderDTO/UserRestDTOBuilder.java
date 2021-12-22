package designpatterns.design_patterns__and_solid_principles.creational.builder.builderDTO;

import java.time.LocalDate;

public class UserRestDTOBuilder implements UserDTOBuilder {
    @Override
    public UserDTOBuilder withFirstName(String fname) {
        return null;
    }

    @Override
    public UserDTOBuilder withLastName(String lname) {
        return null;
    }

    @Override
    public UserDTOBuilder withBirthday(LocalDate date) {
        return null;
    }

    @Override
    public UserDTOBuilder withAddress(Address address) {
        return null;
    }

    @Override
    public UserDTO build() {
        return null;
    }

    @Override
    public UserDTO getUserDTO() {
        return null;
    }
}
