package interfaces;

public class Person implements Info{
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void sayHello(){
        System.out.println("Hello");
    }

    @Override
    public void showInfo() {
        System.out.println("showInfoPerson");
    }
}
