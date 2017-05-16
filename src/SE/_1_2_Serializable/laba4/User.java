package SE._1_2_Serializable.laba4;

import java.io.Serializable;

/**
 * Created by Garret on 29.03.2017.
 */
public class User implements Serializable{
    private String firstName, lastName;
    private int age;

    public User() {
        this.firstName = "Default";
        this.lastName = "DefaultOV";
        this.age = 42;
    }

    public User(String firstName, String lastName, int age) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

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

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User" +
                "First Name is " + firstName + '\n' +
                "Last Name is " + lastName + '\n' +
                "Age: " + age;
    }
}
