package OOP._2_2_Methods.Laba5;

/**
 * Created by Garret on 12.02.2017.
 */
public class A {
    public void calcSquare(int a){
        System.out.println("Kvadrat: "+a*4);
    }
    public void calcSquare(int a,int b){
        System.out.print("Pryamougolnik: ");
        System.out.println((a*2)+(b*2));
    }
    public void calcSquare(double r){
        System.out.println("Round: "+r*r*3.14);
    }
}
