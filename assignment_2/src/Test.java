import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Shape> shapeCollection = new ArrayList<>();
        ShapeCreator squareShapeCreator = new SquareShapeCreator();
        ShapeCreator triangleShapeCreator = new TriangleShapeCreator();

        shapeCollection.add(squareShapeCreator.createShape(6, '#'));
        shapeCollection.add(squareShapeCreator.createShape(10, '$'));
        shapeCollection.add(triangleShapeCreator.createShape(6, '*'));
        shapeCollection.add(triangleShapeCreator.createShape(4, '?'));

        for (Shape shape: shapeCollection) {
            shape.display();
        }
    }
}
