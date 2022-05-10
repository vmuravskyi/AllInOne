package old.softserve.java8;

import java.util.*;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}


public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Petro", 25);
        Person p2 = new Person("Ivan", 35);
        Person p3 = new Person("Aaaaa", 35);
        Person p4 = new Person("Aaaaa", 15);
        Person p5 = new Person("Ira", 35);

        List<Person> list = new ArrayList<>();
        list.add(p1);
        list.add(p5);
        list.add(p2);
        list.add(p3);
        list.add(p4);

        // Sort by age
        list.sort((o1, o2) -> o2.getAge() - o1.getAge());
        // Sort by name
        list.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));


        list.stream()
                .sorted(Comparator.comparingInt(Person::getAge)
                        .thenComparing(Comparator.comparing(Person::getName)))
                .forEach(System.out::println);

        System.out.println("----------------------------------------------------");


        String str = "Java";
        String[] strMas = str.split("");
        List<String> listStr = new ArrayList<>();
        for (String s : strMas) {
            listStr.add(s);
        }
        for (String s : strMas) {
            if (!listStr.contains(s))
                listStr.add(s);
        }

        long count = listStr.stream()
                .distinct()
                .count();

        List<Integer> intList = new ArrayList<>(Arrays.asList(1, 2, 5, 6, 8, 11, 6, 54, 44, 23, 55, 1));

        int sum = intList.stream()
                .limit(300)
                .reduce(0, (summa, i) -> summa += i);



//        List<String> names = Arrays.asList("Volodymyr", "Petro", "Ivan", "Vasyl", "Vitalik");
//
//
//        List<String> filtered = names.stream()
//                .filter(name -> name.startsWith("V"))
//                .filter(name -> name.length() > 5)
//                .distinct()
//                .collect(Collectors.toList());
//
//        System.out.println(filtered);
//
//        String str = "Java";
//        List<Character> list = new ArrayList<>();
//        for (char ch : str.toCharArray()) {
//            list.add(ch);
//        }
//
//
//        List<Character> filter = list.stream()
//                .distinct()
//                .collect(Collectors.toList());
//
//        System.out.println(filter);


    }
}
