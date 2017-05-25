package OOP._2_7_Inheritance_and_Polymorphism.testShapes;

/**
 * Created by Garret on 17.02.2017.
 */
public class Triangle extends Shape {
    private double a,b,c = 0;

    public Triangle(String colorShape, double a, double b, double c) {
        super(colorShape);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", a = " + a +
                ", b = " + b +
                ", c = " + c;
    }

    @Override
    public double calcArea() {
        double s = (a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }

    @Override
    public void draw() {
        String resultToString = this.toString();
        System.out.printf("%s area = %.2f \n",resultToString , calcArea());
    }
    @Override
    public int compareTo(Object o) {
        Shape inputObject = (Shape) o ;
        if (this.calcArea() > inputObject.calcArea())   return 1;
        if (this.calcArea() < inputObject.calcArea())   return -1;
        return 0;
    }
    public static Triangle parseTriangle (String[]arrOfArgs){
        return new Triangle(arrOfArgs[1],Double.parseDouble(arrOfArgs[2]), Double.parseDouble(arrOfArgs[3]), Double.parseDouble(arrOfArgs[4]));
    }
}
