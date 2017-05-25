package SE._1_2_Serializable.laba1;

import java.io.*;

/**
 * Created by Garret on 27.03.2017.
 */
public class SerializeDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Employee employee = new Employee("Sasha", "Pavlenko", 112, 659665324);
        File file = new File("employee.ser");
        FileOutputStream fileOut = new FileOutputStream(file);
        ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
        objOut.writeObject(employee);
        objOut.flush();
        fileOut.flush();
        objOut.close();
        fileOut.close();

        FileInputStream inputStream = new FileInputStream(file);
        ObjectInputStream objInput = new ObjectInputStream(inputStream);

        Employee employee2;
        employee2 = (Employee) objInput.readObject();

        System.out.println(employee2);
    }
}
