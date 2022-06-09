package reflections_and_annotation.section04_reflection_and_annotation_together.lesson19_reading_annotation;

import reflections_and_annotation.section03_annotations.lesson15_meta_and_custom_annotations.MostUsed;
import reflections_and_annotation.section03_annotations.lesson15_meta_and_custom_annotations.Utility;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ReadingAnnotation {

    public static void main(String[] args) throws Exception {

        Class<?> clss = Class.forName(
                "reflections_and_annotation.section03_annotations.lesson15_meta_and_custom_annotations.Utility"
        );
        Constructor<?> constructor = clss.getConstructor();
        Utility utility = (Utility) constructor.newInstance();

        var methods = clss.getDeclaredMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(MostUsed.class)) {
                var annotation = method.getAnnotation(MostUsed.class);
                var value = annotation.value();
                method.setAccessible(true);
                method.invoke(utility, value);
            }
        }

    }

}
