package Design_Patterns.creational.builder.builderInner;

import Design_Patterns.creational.builder.builderDTO.Address;
import Design_Patterns.creational.builder.builderDTO.User;
import Design_Patterns.creational.builder.builderInner.UserDTO.UserDTOBuilder;

import java.time.LocalDate;

public class Client {

    public static void main(String[] args) {
        User user = createUser();

        // Client has to provide director with concrete builderDTO
        UserDTO dto = directBuild(UserDTO.getBuilder(), user);
        System.out.println(dto);
    }

    /**
     * This method serves the role of director in builderDTO pattern.
     */
    private static UserDTO directBuild(UserDTOBuilder builder, User user) {
        return builder.withFirstName(user.getFirstName())
                .withLastName(user.getLastName())
                .withBirthday(user.getBirthday())
                .withAddress(user.getAddress())
                .build();
    }

    /**
     * Returns a sample user.
     */
    public static User createUser() {
        User user = new User();
        user.setBirthday(LocalDate.of(1960, 5, 6));
        user.setFirstName("Ron");
        user.setLastName("Swanson");

        Address address = new Address();
        address.setHouseNumber("100");
        address.setStreet("State Street");
        address.setCity("Pawnee");
        address.setState("Indiana");
        address.setZipcode("47998");
        user.setAddress(address);
        return user;
    }

}
