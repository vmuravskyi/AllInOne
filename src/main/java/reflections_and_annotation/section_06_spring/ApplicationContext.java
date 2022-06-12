package reflections_and_annotation.section_06_spring;

import reflections_and_annotation.annotations_for_section5_and_section6.Autowired;
import reflections_and_annotation.annotations_for_section5_and_section6.Component;
import reflections_and_annotation.annotations_for_section5_and_section6.ComponentScan;
import reflections_and_annotation.annotations_for_section5_and_section6.Configuration;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

public class ApplicationContext {

    private static final HashMap<Class<?>, Object> map = new HashMap<>();

    public ApplicationContext(Class<AppConfig> appConfigClass) {
        Spring.initializeSpringContext(appConfigClass);
    }

    public <T> T getBean(Class<T> productServiceClass) {
        T object = (T) map.get(productServiceClass);


        Field[] declaredFields = productServiceClass.getDeclaredFields();

        injectBean(object, declaredFields);

        return object;
    }

    private <T> void injectBean(T object, Field[] declaredFields) {
        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(Autowired.class)){
                field.setAccessible(true);
                Class<?> type = field.getType();
                Object innerObject = map.get(type);
                try {
                    field.set(object, innerObject);
                    Field[] declaredFields1 = type.getDeclaredFields();
                    injectBean(innerObject, declaredFields);
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    private static class Spring {

        private static void initializeSpringContext(Class<?> appConfigClass) {

            if (!appConfigClass.isAnnotationPresent(Configuration.class)) {

                throw new RuntimeException("The file is not a Configuration file");

            } else {
                ComponentScan annotation = appConfigClass.getAnnotation(ComponentScan.class);
                String value = annotation.value();

//                String packageStructure = "bin" + File.separator + value.replace(".", File.separator);
                String packageStructure = "bin/"+ value.replace(".", "/");

                File[] files = findClasses(new File(packageStructure));

                for (File file : files) {
                    String name = value + "." + file.getName().replace(".class", "");

                    try {
                        Class<?> loadingClass = Class.forName(name);
                        if (loadingClass.isAnnotationPresent(Component.class)) {

                            Constructor<?> constructor = loadingClass.getConstructor();
                            Object newInstance = constructor.newInstance();

                            map.put(loadingClass, newInstance);
                        }
                    } catch (ClassNotFoundException | NoSuchMethodException | InvocationTargetException |
                             InstantiationException | IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
            }

        }

        private static File[] findClasses(File file) {
            if (!file.exists()) {
                throw new RuntimeException("Package " + file + " does not exist");
            } else {
                File[] files = file.listFiles(e -> e.getName().endsWith(".class"));
                return files;
            }
        }

    }

}
