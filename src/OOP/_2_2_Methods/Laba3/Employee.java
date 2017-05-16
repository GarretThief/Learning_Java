package OOP._2_2_Methods.Laba3;

/**
 * Created by Garret on 12.02.2017.
 */
public class Employee {
    public void calcSalary(String name,double... salary){
        double totalSalary = 0;
        for (double x: salary)
            totalSalary+=x;
        System.out.println(name+": "+totalSalary);
    }
}
