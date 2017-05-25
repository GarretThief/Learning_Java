package OOP._2_4_Static_methods_and_fields;

/**
 * Created by Garret on 13.02.2017.
 */
public class Employee {
    private String firstName,lastName;
    private int occupation,telephone;
    private static int numberOfEmployees = 0;
    public Employee(){
        numberOfEmployees++;
    }
    public void setEmployee (String firstName, String lastName, int occupation, int telephone){
        this.firstName = firstName;
        this.lastName = lastName;
        this.occupation = occupation;
        this.telephone = telephone;
    }
    public void getEmployee (){
        System.out.println(firstName + " " + lastName + " " + occupation + " " + telephone);
    }
    public static void main(String[] args){
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        Employee emp3 = new Employee();
        Employee emp4 = new Employee();
        System.out.println(emp2.numberOfEmployees);

    }
}
