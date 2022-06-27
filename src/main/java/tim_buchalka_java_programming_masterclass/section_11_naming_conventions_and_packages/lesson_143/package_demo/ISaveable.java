package tim_buchalka_java_programming_masterclass.section_11_naming_conventions_and_packages.lesson_143.package_demo;

import java.util.List;

/**
 * Created by dev on 30/09/15.
 */
public interface ISaveable {

    List<String> write();

    void read(List<String> savedValues);

}
