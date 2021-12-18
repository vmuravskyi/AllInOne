package Design_Patterns.creational.builder.builderDTO;

import java.time.LocalDate;

//This is our client which also works as "director"
public class Client {

    public static void main(String[] args) {

        User user = createUser();
        UserDTOBuilder builder = new UserWebDTOBuilder();
        UserDTO dto = directBuilder(builder, user);
        System.out.println(dto);

    }

    public static UserDTO directBuilder(UserDTOBuilder builder, User user) {
        return builder.withFirstName(user.getFirstName())
                .withLastName(user.getLastName())
                .withAddress(user.getAddress())
                .withBirthday(user.getBirthday())
                .build();
    }

    /**
     * Returns a sample user.
     */
    public static User createUser() {
        User user = new User();
        user.setBirthday(LocalDate.of(1991, 4, 3));
        user.setFirstName("Volodymyr");
        user.setLastName("Muravskyi");
        Address address = new Address();
        address.setHouseNumber("103");
        address.setStreet("Striiska Street");
        address.setCity("Drohobych");
        address.setState("Lviv");
        address.setZipcode("82100");
        user.setAddress(address);
        return user;
    }
}
