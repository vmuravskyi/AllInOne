package Design_Patterns.creational.builder.mybuilder;

public class ProgramBuilder {

    public static void main(String[] args) {

        RoomDTO roomDTO = new RoomDTOBuilder()
                .withDefaultDesk()
                .withChair("Gaming chair")
                .withFridge("Gorenje fridge")
                .withShelf("Soviet shelf")
                .withPicture("Vaza")
                .build();

        System.out.println(roomDTO);
    }

}
