package design_patterns.design_patterns__and_solid_principles.creational.builder.builderDTO;

import java.time.LocalDate;
import java.time.Period;

//The concrete builderDTO for UserWebDTO
public class UserWebDTOBuilder implements UserDTOBuilder {

    private String firstName;
    private String lastName;
    private String age;
    private String address;
    private UserWebDTO dto;

    @Override
    public UserDTOBuilder withFirstName(String fname) {
        firstName = fname;
        return this;
    }

    @Override
    public UserDTOBuilder withLastName(String lname) {
        lastName = lname;
        return this;
    }

    @Override
    public UserDTOBuilder withBirthday(LocalDate date) {
        Period ageInYears = Period.between(date, LocalDate.now());
        age = Integer.toString(ageInYears.getYears());
        return this;
    }

    @Override
    public UserDTOBuilder withAddress(Address address) {
        this.address = address.getState() + ", "
                + address.getCity() + ", "
                + address.getStreet() + ", "
                + address.getHouseNumber() + ", "
                + address.getZipcode();
        return this;
    }

    @Override
    public UserDTO build() {
        dto = new UserWebDTO(firstName + " " + lastName, address, age);
        return dto;
    }

    @Override
    public UserDTO getUserDTO() {
        if (dto != null) {
            return dto;
        }
        throw new NullPointerException("DTO has not been built");
    }
}
