package OOP._2_7_Inheritance_and_Polymorphism.testShapes;

/**
 * Created by Garret on 17.02.2017.
 */
public class Rectangle extends Shape{
    private double width = 0;
    private double height = 0;

    public Rectangle(String colorShape, double a, double b) {
        super(colorShape);
        this.width = a;
        this.height = b;
    }


    public double calcArea() {
        return width*height;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", width = " + width +
                ", height = " + height;
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

        public static Rectangle parseRectangle (String[]arrOfArgs){
        return new Rectangle(arrOfArgs[1],Double.parseDouble(arrOfArgs[2]), Double.parseDouble(arrOfArgs[3]));
        }
    }

