package OOP._2_11_Exceptions_and_Assertions.testexcp1;

/**
 * Created by Garret on 26.02.2017.
 */
public class Main {
    public static void main(String[] args) {

        try{
           throw new Exception("Warning,this is true exception!!!");
        }catch (Exception exc){
            System.out.println(exc.getMessage());
        }finally {
            System.out.println("Finally");
        }

        MyException ex = new MyException ("This is My Exception");
        try{
            throw ex;
        }catch (MyException e){
            ex.printMyException();
        }

        MyTest myTest = null;
//        try {
//            myTest.test();
//        } catch (MyException e) {
//            e.printMyException();
//        }

//        myTest.printMyException();
    }
}
