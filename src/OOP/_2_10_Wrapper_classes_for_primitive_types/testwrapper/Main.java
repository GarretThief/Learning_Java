package OOP._2_10_Wrapper_classes_for_primitive_types.testwrapper;

/**
 * Created by Garret on 21.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        Integer x1 = 42;
        Integer x2 = new Integer(42);
        Integer x3 = Integer.valueOf(42);
        Integer x4 = Integer.parseInt("42");
        System.out.println(x1==x2);
        System.out.println(x1==x3);
        System.out.println(x1==x4);
        System.out.println(x2==x3);
        System.out.println(x2==x4);
        System.out.println(x3==x4);
        System.out.println("~~~~~~~~~~~~~~~");
        System.out.println(x1.equals(x2));
        System.out.println(x1.equals(x3));
        System.out.println(x1.equals(x4));
        System.out.println(x2.equals(x3));
        System.out.println(x2.equals(x4));
        System.out.println(x3.equals(x4));
    }
}
