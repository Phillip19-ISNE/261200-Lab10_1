public class Main {
    public static void main(String[] args) {

        ShapeFactory factory = new ShapeFactory();

        // Create 2 Circles
        Shape circle1 = factory.getShape(ShapeFactory.TYPE_CIRCLE);
        circle1.draw();

        Shape circle2 = factory.getShape(ShapeFactory.TYPE_CIRCLE);
        circle2.draw();

        // Try to create a 3rd Circle
        Shape circle3 = factory.getShape(ShapeFactory.TYPE_CIRCLE);

        // Create 2 Triangles
        Shape triangle1 = factory.getShape(ShapeFactory.TYPE_TRIANGLE);
        triangle1.draw();

        Shape triangle2 = factory.getShape(ShapeFactory.TYPE_TRIANGLE);
        triangle2.draw();

        // Create 1 Ellipse
        Shape ellipse1 = factory.getShape(ShapeFactory.TYPE_ELLIPSE);
        ellipse1.draw();

        // Try to create another shape
        Shape ellipse2 = factory.getShape(ShapeFactory.TYPE_ELLIPSE);
    }
}
