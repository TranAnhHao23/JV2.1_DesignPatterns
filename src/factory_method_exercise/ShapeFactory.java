package factory_method_exercise;

public class ShapeFactory {

    public ShapeFactory() {
    }

    public Shape drawShape(String name) {
        if (name.equals("Circle")) {
            return new Circle();
        } else if (name.equals("Square")){
            return new Square();
        } else {
            return new Rectangle();
        }
    }
}
