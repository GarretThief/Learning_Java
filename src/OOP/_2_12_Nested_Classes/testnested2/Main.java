package OOP._2_12_Nested_Classes.testnested2;

/**
 * Created by Garret on 01.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        MyTestClass myTestClass = new MyTestClass();
//        myTestClass.MyStaticNested.MyInner.MyLocal;
        MyTestClass.MyStaticNested myLocal = new MyTestClass.MyStaticNested();

    }
}
