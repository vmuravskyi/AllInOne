package collections.stack;

import java.util.Stack;

public class Test {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(5);
        stack.push(3);
        stack.push(1);
        stack.push(0);

        while (!stack.empty()) {
            System.out.println(stack.pop());
        }


    }
}
