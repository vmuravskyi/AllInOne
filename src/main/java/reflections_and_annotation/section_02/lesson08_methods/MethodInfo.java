package reflections_and_annotation.section_02.lesson08_methods;

import reflections_and_annotation.section_02.lesson07_fields.Entity;

import java.lang.reflect.Method;

public class MethodInfo {

    public static void main(String[] args) throws Exception {

        Entity entity = new Entity(10, "id");
        Class<? extends Entity> clss = entity.getClass();

        var methods = clss.getMethods(); // get all methods including from super class
        for (Method method :methods) {
            System.out.println(method.getName());
        }

        System.out.println("---------------------------------------------------------------------------");

        var declaredMethods = clss.getDeclaredMethods(); // get all declared method
        for (Method method : declaredMethods) {
            System.out.println(method.getName());
        }

        System.out.println("---------------------------------------------------------------------------");

        Method methodSetVal = clss.getMethod("setVal", int.class);
        methodSetVal.invoke(entity, 99999); // invoke a method on a certain object

        Method methodGetVal = clss.getMethod("getVal");
        System.out.println(methodGetVal.invoke(entity, null)); // invoke getVal method on Entity object

    }

}
