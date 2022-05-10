package old.collections.queue;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Test {
    public static void main(String[] args) {
        Person person1 = new Person(1);
        Person person2 = new Person(2);
        Person person3 = new Person(3);
        Person person4 = new Person(4);

        Queue<Person> people = new ArrayBlockingQueue<>(3);
        people.offer(person3);
        people.offer(person2);
        people.offer(person4);
        people.offer(person1);


        System.out.println(people.remove());
        System.out.println(people.peek());
        System.out.println(people);
//        for (Person person : people)
//            System.out.println(person);
    }
}
