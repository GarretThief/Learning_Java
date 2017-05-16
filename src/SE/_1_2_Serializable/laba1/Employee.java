package SE._1_2_Serializable.laba1;

import java.io.Serializable;

/**
 * Created by Garret on 27.03.2017.
 */
public class Employee implements Serializable {
    private String name;
    private String address;
    private transient int ssn;
    private int number;

    public Employee(String name, String address, int ssn, int number) {
        this.name = name;
        this.address = address;
        this.ssn = ssn;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n"+
                "Address: " + address + "\n"+
                "ssm: " + ssn + "\n" +
                "Number: " + number;
    }
}
