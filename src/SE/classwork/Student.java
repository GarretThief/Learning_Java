package SE.classwork;

import java.io.*;


public class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    private String firstName;
    private String lastName;
    private int age;

    public Student(String fn, String ln, int a) {
        this.firstName = fn;
        this.lastName = ln;
        this.age = a;
        System.out.println("Constructor");
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) throws IOException {
        File file = new File("student.ser");
        Student s = new Student("Sasha", "Petrov", 22);
        FileOutputStream fos = new FileOutputStream("student.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        if(!file.exists()) file.createNewFile();

        try {
            oos.writeObject(s);
        } finally {
            oos.close();
        }

        Student s2;
        FileInputStream fis = new FileInputStream("student.ser");
        ObjectInputStream oin = new ObjectInputStream(fis);


        try {
            s2 = (Student) oin.readObject();

            System.out.println("FirstName: " + s2.getFirstName());
            System.out.println("LastName: " + s2.getLastName());
            System.out.println("Age: " + s2.getAge());
        } catch (ClassNotFoundException e1) {
            e1.printStackTrace();
        } finally {
            oin.close();
        }
    }
}



