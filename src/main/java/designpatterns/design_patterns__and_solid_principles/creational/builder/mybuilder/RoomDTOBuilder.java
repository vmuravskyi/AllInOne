package designpatterns.design_patterns__and_solid_principles.creational.builder.mybuilder;

public class RoomDTOBuilder {

    RoomDTO roomDTO = new RoomDTO();

    public RoomDTOBuilder withDefaultDesk() {
        roomDTO.setDesk(Desk.getDefaultDesk());
        return this;
    }

    public RoomDTOBuilder withShelf(String shelf) {
        roomDTO.setShelf(shelf);
        return this;
    }

    public RoomDTOBuilder withFridge(String fridge) {
        roomDTO.setFridge(fridge);
        return this;
    }

    public RoomDTOBuilder withChair(String chair) {
        roomDTO.setChair(chair);
        return this;
    }

    public RoomDTOBuilder withPicture(String picture) {
        roomDTO.setPicture(picture);
        return this;
    }

    public RoomDTO build() {
        return roomDTO;
    }

    public RoomDTO getRoomDTO() {
        if (roomDTO != null) {
            return roomDTO;
        } else throw new NullPointerException("RoomDTO object has not been built");
    }
}
