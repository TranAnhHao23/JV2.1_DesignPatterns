package factory_method_exercise;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 = shapeFactory.drawShape("Circle");
        shape1.draw();
        Shape shape2 = shapeFactory.drawShape("Square");
        shape2.draw();
        Shape shape3 = shapeFactory.drawShape("Hello");
        shape3.draw();
    }

}
