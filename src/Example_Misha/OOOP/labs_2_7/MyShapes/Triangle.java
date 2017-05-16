package Example_Misha.OOOP.labs_2_7.MyShapes;

public class Triangle extends Shape {
    private double a, b, c;

    public Triangle(String shapeColor, String shapeName, double a, double b, double c) {
        super(shapeColor, shapeName);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return super.toString() + "\n a= " + a + " b= " + b + " c= " + c;
    }

    public double calcArea() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public void draw() {
        System.out.println(this.toString() + " area = " + calcArea());
    }

    @Override
    public int compareTo(Object o) {
        Shape inputObject = (Shape) o;
        if (this.calcArea() > inputObject.calcArea()) return 1;
        if (this.calcArea() < inputObject.calcArea()) return -1;
        return 0;
    }
}