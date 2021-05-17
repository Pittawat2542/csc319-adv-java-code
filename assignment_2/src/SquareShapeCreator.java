public class SquareShapeCreator extends ShapeCreator {

    @Override
    public Shape createShape(int size, char pattern) {
        return new Square(size, pattern);
    }
}
