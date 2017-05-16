package Example_Misha.OOOP.labs_2_7.MyShapes;

public class Circle extends Shape implements Comparable{
    private double radius;
    static final double PI = Math.PI;

    public Circle(String shapeColor, String shapeName, double radius) {
        super(shapeColor, shapeName);
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        return PI * Math.pow(radius, 2);
    }


    @Override
    public void draw() {
        String resultToString = this.toString();
        System.out.println(
                resultToString +
                        " area = " + this.calcArea());
    }

    @Override
    public int compareTo(Object o) {
        Shape inputObject = (Shape) o;
        if (this.calcArea() > inputObject.calcArea()) return 1;
        if (this.calcArea() < inputObject.calcArea()) return -1;
        return 0;
    }

    @Override
    public String toString() {
        return super.toString() + "\nRadius of shape: " + radius;
    }

}