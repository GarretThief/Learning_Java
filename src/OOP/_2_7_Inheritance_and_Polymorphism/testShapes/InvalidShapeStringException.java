package OOP._2_7_Inheritance_and_Polymorphism.testShapes;


public class InvalidShapeStringException extends Exception {
    @Override
    public String getMessage() {
        return "Invalid Shape!!!";
    }
}
