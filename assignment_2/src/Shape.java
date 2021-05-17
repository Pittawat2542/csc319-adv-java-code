public abstract class Shape {
    private String shape;
    private int size;
    private char pattern;

    public Shape(String shape, int size, char pattern) {
        this.shape = shape;
        this.size = size;
        this.pattern = pattern;
    }

    abstract public void display();

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public char getPattern() {
        return pattern;
    }

    public void setPattern(char pattern) {
        this.pattern = pattern;
    }
}
