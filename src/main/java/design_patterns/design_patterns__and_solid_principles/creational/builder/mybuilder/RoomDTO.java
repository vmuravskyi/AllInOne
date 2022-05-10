package design_patterns.design_patterns__and_solid_principles.creational.builder.mybuilder;

public class RoomDTO {

    private Desk desk;
    private String shelf;
    private String fridge;
    private String chair;
    private String picture;

    public void setDesk(Desk desk) {
        this.desk = desk;
    }

    public void setShelf(String shelf) {
        this.shelf = shelf;
    }

    public void setFridge(String fridge) {
        this.fridge = fridge;
    }

    public void setChair(String chair) {
        this.chair = chair;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    @Override
    public String toString() {
        return "RoomDTO{" +
                "\ndesk=" + desk +
                ", \nshelf='" + shelf + '\'' +
                ", \nfridge='" + fridge + '\'' +
                ", \nchair='" + chair + '\'' +
                ", \npicture='" + picture + '\'' +
                '}';
    }
}
