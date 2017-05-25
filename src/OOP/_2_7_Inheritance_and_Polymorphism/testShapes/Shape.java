package OOP._2_7_Inheritance_and_Polymorphism.testShapes;


/**
 * Created by Garret on 17.02.2017.
 */
public abstract class Shape implements Drawable {

    String colorShape = "Default color";

    public Shape(String colorShape) {
        this.colorShape = colorShape;
    }

    public String getColorShape() {
        return colorShape;
    }

    public void setColorShape(String colorShape) {
        this.colorShape = colorShape;
    }

    @Override
    public String toString() {
        return "This is " + this.getClass().getSimpleName() +
                ", color is: " + colorShape;
    }

    public abstract double calcArea();

    public static Shape parseShape(String inputString) throws InvalidShapeStringException {
        String[] tokkens = inputString.split(" ");
            switch (tokkens[0]) {
                case "Circle":
                    return Circle.parseCircle(tokkens);
                case "Rectangle":
                    return Rectangle.parseRectangle(tokkens);
                case "Triangle":
                    return Triangle.parseTriangle(tokkens);
                default:
                    throw new InvalidShapeStringException();
            }
    }
}
