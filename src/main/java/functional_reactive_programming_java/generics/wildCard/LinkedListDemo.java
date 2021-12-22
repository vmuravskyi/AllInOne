package functional_reactive_programming_java.generics.wildCard;

import functional_reactive_programming_java.generics.DataNode;

public class LinkedListDemo {

    public static void main(String[] args) {

        DataNode<Integer> node2 = new DataNode<>(20, null);
        DataNode<Integer> node1 = new DataNode<>(10, node2);

        DataNode<Double> node22 = new DataNode<>(20.01, null);
        DataNode<Double> node11 = new DataNode<>(10.47, node22);

        DataNode<String> node222 = new DataNode<>("Another hello from node 222", null);
        DataNode<String> node111 = new DataNode<>("Hello", node222);

        System.out.println(node1);
        System.out.println(node11);
        System.out.println(node111);


    }

}
