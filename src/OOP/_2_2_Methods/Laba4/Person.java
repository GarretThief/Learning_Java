package OOP._2_2_Methods.Laba4;

/**
 * Created by Garret on 12.02.2017.
 */
public class Person {
    private String firstName;
    private String lastName;
    private String gender;
    private int phoneNumber;
    private int age;


    public void setPerson(int phoneNumber, int age){
        this.phoneNumber = phoneNumber;
        this.age = age;
    }
    public void setPerson(String firstName){
        this.firstName = firstName;
    }
    public void setPerson(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public void setPerson(String firstName,String lastName, String gender){
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }
    public void setPerson(String firstName,String lastName, String gender, int phoneNumber, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

}
