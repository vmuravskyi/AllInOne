package reflections_and_annotation.section03_annotations.lesson15_meta_and_custom_annotations;

import java.lang.annotation.*;

@Documented
@Inherited
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface MostUsed {

    String value() default "Java";

}
