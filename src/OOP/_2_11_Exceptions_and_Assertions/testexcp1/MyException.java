package OOP._2_11_Exceptions_and_Assertions.testexcp1;

/**
 * Created by Garret on 26.02.2017.
 */
public class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
    public void printMyException(){
        System.out.println(super.getMessage());
    }
}
