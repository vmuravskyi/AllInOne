package Design_Patterns.creational.builder.mybuilder;

public class Desk {
    private String laptop;
    private String notepad;
    private String book;
    private String mouse;
    private String phone;

    public Desk() {
    }

    public Desk(String laptop, String notepad, String book, String mouse, String phone) {
        this.laptop = laptop;
        this.notepad = notepad;
        this.book = book;
        this.mouse = mouse;
        this.phone = phone;
    }

    public static Desk getDefaultDesk() {
        return new Desk(
                "ThinkPad T14 gen1",
                "Leather notepad",
                "Java book",
                "Logitech M280",
                "Xiaomi Redmi 8 Pro"
        );
    }

    public String getLaptop() {
        return laptop;
    }

    public void setLaptop(String laptop) {
        this.laptop = laptop;
    }

    public String getNotepad() {
        return notepad;
    }

    public void setNotepad(String notepad) {
        this.notepad = notepad;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public String getMouse() {
        return mouse;
    }

    public void setMouse(String mouse) {
        this.mouse = mouse;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Desk include:" +
                "laptop='" + laptop + '\'' +
                ", notepad='" + notepad + '\'' +
                ", book='" + book + '\'' +
                ", mouse='" + mouse + '\'' +
                ", phone='" + phone + '\'';
    }
}
