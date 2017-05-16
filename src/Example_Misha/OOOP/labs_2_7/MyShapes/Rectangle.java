package Example_Misha.OOOP.labs_2_7.MyShapes;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String shapeColor, String shapeName, double width, double height) {
        super(shapeColor, shapeName);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calcArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return super.toString() +
                " \n Width: " + width + " Height: " + height;

    }

    @Override
    public void draw() {
        String resultToString = this.toString();
        System.out.println(resultToString +/*
                " height = " + this.height +
                " width = " + this.width +*/
                " area = " + this.calcArea());
    }

    @Override
    public int compareTo(Object o) {
        Shape inputObject = (Shape) o;
        if (this.calcArea() > inputObject.calcArea()) return 1;
        if (this.calcArea() < inputObject.calcArea()) return -1;
        return 0;
    }
}
