package Design_Patterns.creational.builder.mybuilder;

import java.util.Objects;

public class Room {

    private Desk desk;
    private String shelf;
    private String fridge;
    private String chair;
    private String picture;

    public Desk getDesk() {
        return desk;
    }

    public void setDesk(Desk desk) {
        this.desk = desk;
    }

    public String getShelf() {
        return shelf;
    }

    public void setShelf(String shelf) {
        this.shelf = shelf;
    }

    public String getFridge() {
        return fridge;
    }

    public void setFridge(String fridge) {
        this.fridge = fridge;
    }

    public String getChair() {
        return chair;
    }

    public void setChair(String chair) {
        this.chair = chair;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return Objects.equals(desk, room.desk) && Objects.equals(shelf, room.shelf) && Objects.equals(fridge, room.fridge) && Objects.equals(chair, room.chair) && Objects.equals(picture, room.picture);
    }

    @Override
    public int hashCode() {
        return Objects.hash(desk, shelf, fridge, chair, picture);
    }
}
