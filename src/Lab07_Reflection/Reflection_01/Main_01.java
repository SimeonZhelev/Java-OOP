package Lab07_Reflection.Reflection_01;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class Main_01 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Class<Reflection_01> reflectionClass = Reflection_01.class;

        System.out.println(reflectionClass);
        System.out.println(reflectionClass.getSuperclass());
        Arrays.stream(reflectionClass.getInterfaces())
                .forEach(i -> System.out.println(i));
        System.out.println(reflectionClass.getConstructor().newInstance());



    }
}
