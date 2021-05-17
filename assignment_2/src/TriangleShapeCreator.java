public class TriangleShapeCreator extends ShapeCreator {
    @Override
    public Shape createShape(int size, char pattern) {
        return new Triangle(size, pattern);
    }
}
