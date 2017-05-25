package SE._1_5_Reflections;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Created by Garret on 06.05.2017.
 */
public class Main {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        Class<?> refClass = myClass.getClass();
        System.out.println(refClass);

        System.out.println("Modifiers: ");
        int modifiers = refClass.getModifiers();
        if (Modifier.isPublic(modifiers))
            System.out.println("\tpublic");
        if (Modifier.isFinal(modifiers))
            System.out.println("\tfinal");

        System.out.println("Public fields:");
        Field[] fields = refClass.getFields();
        for (Field field : fields) {
            Class<?> fieldType = field.getType();
            System.out.println("\tName: " + field.getName());
            System.out.println("\tType: " + fieldType.getName());
        }

        System.out.println("All Fields:");
        fields = refClass.getDeclaredFields();
        for (Field field : fields) {
            Class<?> fieldType = field.getType();
            System.out.println("\tName: " + field.getName());
            System.out.println("\tType: " + fieldType.getName());
        }

        Constructor<?>[] constructors = refClass.getConstructors();
        int i = 0;
        for (Constructor<?> consts : constructors) {
            System.out.print("Constructor " + (i++) + " : ");
            Class<?>[] paramConsts = consts.getParameterTypes();
            for (Class<?> params : paramConsts){
                System.out.print(params.getName() + " ");
            }
            System.out.println();
        }

        Method[] methods = refClass.getMethods();
        for (Method method : methods){
            System.out.println("Name: " + method.getName());
            System.out.println("\tReturn type: " + method.getReturnType().getName());
            Class<?>[] paramType = method.getParameterTypes();
            System.out.print("\tParam types:");
            for (Class<?> param : paramType){
                System.out.print(" " + param.getName());
            }
            System.out.println();
        }

        //LABA 2

        try {
            Field field = refClass.getDeclaredField("s");
            field.setAccessible(true);
            System.out.println("Old string: " + field.get(myClass));
            field.set(myClass, "zxcv");
            System.out.println("New String: " + field.get(myClass));
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }
}
