package factory_design_pattern;

public class ShapeFactory {
    public static Shape getShape(String shapeType) {

        if (shapeType == null) {
            return null;
        }

        switch (shapeType.toLowerCase()) {
            case "circle":
                return new Circle();
            case "square":
                return new Square();
            case "rectangle":
                return new Rectangle();
            default:
                throw new IllegalArgumentException("Invalid shape type: " + shapeType);
        }
    }
}
