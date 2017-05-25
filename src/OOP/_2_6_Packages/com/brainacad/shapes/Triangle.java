package OOP._2_6_Packages.com.brainacad.shapes;



/**
 * Created by Garret on 15.02.2017.
 */
public class Triangle {
    private double a,b,c = 1.0;
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }



    public double getArea(){
        double s = (a+b+c)/2;

        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return area;
    }
}
