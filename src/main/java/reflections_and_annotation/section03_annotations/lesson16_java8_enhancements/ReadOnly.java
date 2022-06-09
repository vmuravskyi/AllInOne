package reflections_and_annotation.section03_annotations.lesson16_java8_enhancements;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE_PARAMETER, ElementType.TYPE_USE})
public @interface ReadOnly {
}
