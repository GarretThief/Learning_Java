package OOP._2_7_Inheritance_and_Polymorphism.testShapes;

/**
 * Created by Garret on 17.02.2017.
 */
public class Circle extends Shape{
   private double r = 0;

    public Circle(String colorShape, double r) {
        super(colorShape);
        this.r = r;
    }

    @Override
    public double calcArea() {
        return Math.PI * Math.pow(r,2);
    }

    @Override
    public String toString() {
        return super.toString() +
                ", radius = " + r;
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
    public static Circle parseCircle (String[]arrOfArgs){
        return new Circle(arrOfArgs[1],Double.parseDouble(arrOfArgs[2]));
    }
}
