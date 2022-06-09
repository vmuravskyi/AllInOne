package reflections_and_annotation.section03_annotations.lesson16_java8_enhancements;

import java.lang.annotation.*;

@Repeatable(value = Designations.class)
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Designation {

    String value() default "Employee";

}
