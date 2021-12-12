//package Trash.Classes;
//
//public class Lesson19 {
//    public static void main(String[] args) {
//        Human h1 = new Human("Vova", 30);
//        Human h2 = new Human("John", 40);
//        Human.description = "Has 2 hands";
//        h1.getInfo();
//        h2.getInfo();
//        Human.description = "Has 2 legs";
//        h1.getInfo();
//        h2.getInfo();
//        h1.printNumberOfPeople();
//        h2.printNumberOfPeople();
//        Human h3 = new Human("Bob", 25);
//        h3.printNumberOfPeople();
//    }
//}
//
//class Human {
//    private String name;
//    private int age;
//    public static String description;
//    public static int countPeople;
//
//    public Human(String name, int age) {
//        this.name = name;
//        this.age = age;
//        countPeople++;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//    public void setAge(int myAge) {
//        this.age = myAge;
//    }
//    public String getName() {
//        return name;
//    }
//    public int getAge() {
//        return age;
//    }
//
//    public void getInfo() {
//        System.out.println("Name: " + name + " Age: " + age + " Description: " + description);
//    }
//
//    public void printNumberOfPeople(){
//        System.out.println("Number of people is: "+countPeople);
//    }
//}
