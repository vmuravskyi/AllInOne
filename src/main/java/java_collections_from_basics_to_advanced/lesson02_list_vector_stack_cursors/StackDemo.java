package java_collections_from_basics_to_advanced.lesson02_list_vector_stack_cursors;

import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {

        Stack stack = new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println(stack);

        var pop = stack.pop(); // get the element with deleting
        System.out.println(pop);

        System.out.println(stack);

        var peek = stack.peek(); // gets the element without deleting
        System.out.println(peek);
        System.out.println(stack);

        System.out.println(stack.empty());

        var search = stack.search(10);
        System.out.println(search);

    }

}
