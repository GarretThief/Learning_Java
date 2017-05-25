package OOP._2_5_Initialization_sections;

/**
 * Created by Garret on 13.02.2017.
 */
public class MyInitTest {
    static {
        System.out.println("static initialization block 1");
    }
    static {
        System.out.println("static initialization block 2");
    }
    {
        System.out.println("non-static initialization block 1");
    }
    {
        System.out.println("non-static initialization block 2");
    }
    public MyInitTest(){
        this(1);
        System.out.println("constructor 1");
    }
    public MyInitTest(int i){
        System.out.println("constructor 2");
    }
}
