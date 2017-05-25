package OOP._2_11_Exceptions_and_Assertions.exception_demo;

/**
 * Created by Garret on 26.02.2017.
 */
public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws InvalidAgeException {
        if (age < 1 || age > 120)
            throw new InvalidAgeException();
        else
            this.age = age;
    }
}
