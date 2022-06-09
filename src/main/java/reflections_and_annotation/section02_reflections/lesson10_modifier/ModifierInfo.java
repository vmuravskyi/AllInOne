package reflections_and_annotation.section02_reflections.lesson10_modifier;

import reflections_and_annotation.section02_reflections.lesson07_fields.Entity;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ModifierInfo {

    public static void main(String[] args) throws Exception {

        Entity entity = new Entity(10, "id");
        Class<? extends Entity> clss = entity.getClass();

        int modifiersInt = clss.getModifiers();

        System.out.println(Modifier.toString(modifiersInt)); // print access modifier of the class

        int i = modifiersInt & Modifier.PUBLIC; // returns either 1 if class is public, or 0 if not
        boolean isPublic = Modifier.isPublic(modifiersInt); // better way to check modifier
        System.out.println(isPublic);

        System.out.println("----------------------------------------------------------------------------------");

        // get method modifiers
        Method getValMethod = clss.getMethod("getVal", null);
        int methodModifiers = getValMethod.getModifiers();
        boolean isPrivate = Modifier.isPrivate(methodModifiers); // check if 'getVal' method is private
        System.out.println(isPrivate);
        System.out.println(Modifier.toString(methodModifiers)); // or print the actual modifier

    }

}
