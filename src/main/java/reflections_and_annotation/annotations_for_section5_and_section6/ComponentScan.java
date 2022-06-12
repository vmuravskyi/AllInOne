package reflections_and_annotation.annotations_for_section5_and_section6;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(ComponentScans.class)
public @interface ComponentScan {

    public String value();

}
