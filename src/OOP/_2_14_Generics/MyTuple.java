package OOP._2_14_Generics;

/* Laba 1
 * 1) Create a generic class MyTuple<A,B,C> with three fields of different types, provide constructor with
 * three parameters and getters for each field.
 * 2) Create a class Main with a main() method. Add to method main() code that creates two objects of MyTuple.
 * The first must be parameterized with next types: String, Integer, Long.
 * The second must be parameterized with next types: Double, String, String.
 */

public class MyTuple <A,B,C> {
    private A a;
    private B b;
    private C c;

    public MyTuple(A a, B b, C c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public A getA() {
        return a;
    }

    public B getB() {
        return b;
    }

    public C getC() {
        return c;
    }

    @Override
    public String toString() {
        return "Type A: " + a.getClass().getSimpleName() +
                "\nValue of a = " + a +
                "\nType B: " + b.getClass().getSimpleName() +
                "\nValue of b = " + b +
                "\nType C: " + c.getClass().getSimpleName() +
                "\nValue of c = " + c + "\n";
    }
}
