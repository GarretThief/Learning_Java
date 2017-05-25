package OOP._2_2_Methods.Laba3;

/**
 * Created by Garret on 12.02.2017.
 */
public class Accauntant {
    public static void main(String[] args){
        Employee rab1 = new Employee();
        Employee rab2 = new Employee();
        rab1.calcSalary("Aleksandr", 1234.5,1678.3,2045);
        rab1.calcSalary("Aleksandr", 800,1200);
        rab1.calcSalary("Aleksandr", 7689);
        rab2.calcSalary("Maryna", 6578,234.6,456.2,856);
        rab2.calcSalary("Maryna", 3450,550);
        rab2.calcSalary("Maryna", 7823);
    }
}
