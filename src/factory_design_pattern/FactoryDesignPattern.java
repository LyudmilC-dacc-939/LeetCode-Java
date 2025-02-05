package factory_design_pattern;

public class FactoryDesignPattern {

    //3. Factory Design Pattern
    //Problem:
    //Create a ShapeFactory that can produce Circle, Square, and Rectangle
    // objects based on a string input ("circle", "square", or "rectangle").
    // Ensure proper abstraction and reusability.

    public static void main(String[] args) {

        Shape circle = ShapeFactory.getShape("circle");
        Shape square = ShapeFactory.getShape("square");
        Shape rectangle = ShapeFactory.getShape("rectangle");

        circle.draw();
        square.draw();
        rectangle.draw();
    }
}
