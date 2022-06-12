package reflections_and_annotation.section_07_method_handles;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.VarHandle;

public class MethodHandlesDemo {

    public static void main(String[] args) throws Throwable {

        MethodHandles.Lookup lookup = MethodHandles.lookup();
        Class<?> clss = lookup.findClass(Student.class.getName());

        MethodType methodType = MethodType.methodType(String.class);

        Student student = new Student();
        student.setCourse("Java");

        MethodHandle getCourseHandle = lookup.findVirtual(Student.class, "getCourse", methodType);

        System.out.println(getCourseHandle.invoke(student));

        MethodType methodType1 = MethodType.methodType(void.class);
        MethodHandle noArgHandle = lookup.findConstructor(clss, methodType1);
        Student studentNoArgs = (Student) noArgHandle.invoke();
        studentNoArgs.setName("John");
        studentNoArgs.setCourse("Scala");
        System.out.println(studentNoArgs);

        MethodType methodType2 = MethodType.methodType(void.class, String.class, String.class);
        MethodHandle paramCons = lookup.findConstructor(Student.class, methodType2);
        Student studentParamCons = (Student) paramCons.invoke("Jack", "Python");
        System.out.println(studentParamCons);

        MethodType methodType3 = MethodType.methodType(void.class, String.class);
        MethodHandle setNameHandle = lookup.findVirtual(clss, "setName", methodType3);
        setNameHandle.invoke(studentNoArgs, "Vincent");
        System.out.println(studentNoArgs);

        // for invoking static method use findStatic
        MethodType methodType4 = MethodType.methodType(void.class, int.class);
        MethodHandle setNumOfStudents = lookup.findStatic(clss, "setNumOfStudents", methodType4);
        setNumOfStudents.invoke(123);
        System.out.println(studentNoArgs.getNumOfStudents());

        MethodHandles.Lookup privateLookup = MethodHandles.privateLookupIn(clss, lookup);

        MethodHandle findGetter = privateLookup.findGetter(clss, "name", String.class);
        MethodHandle findSetter = privateLookup.findSetter(clss, "name", String.class);
//        System.out.println(findGetter.invoke());
        findSetter.invoke(studentNoArgs, "Justin");
        System.out.println(studentNoArgs);


        // VarHandles
        VarHandle courseVarHandle = privateLookup.findVarHandle(clss, "course", String.class);
        courseVarHandle.set(studentNoArgs, "Kotlin");
        String courseValue = (String) courseVarHandle.get(studentNoArgs);
        System.out.println(studentNoArgs);

    }

}
