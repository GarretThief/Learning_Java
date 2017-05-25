package OOP._2_11_Exceptions_and_Assertions.exception_demo;

/**
 * Created by Garret on 26.02.2017.
 */
public class InvalidAgeException extends RuntimeException {
    @Override
    public String getMessage() {
        return "Invalid Age!";
    }
}
