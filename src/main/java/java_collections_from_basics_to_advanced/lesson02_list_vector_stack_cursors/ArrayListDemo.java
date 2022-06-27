package java_collections_from_basics_to_advanced.lesson02_list_vector_stack_cursors;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList aList = new ArrayList();
        System.out.println(aList.size());

        ArrayList aList2 = new ArrayList(30);

//        ArrayList aLIst3 = new ArrayList(Collection c);

        aList.add("John");
        aList.add(true);
        aList.add(123.345f);

        System.out.println(aList);

        aList.remove(0);
        System.out.println(aList);

        aList.remove(Float.valueOf(123.345f));
        System.out.println(aList);

        System.out.println(aList.get(0));

        

    }

}