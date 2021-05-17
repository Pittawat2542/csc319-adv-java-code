public class Triangle extends Shape {

    public Triangle(int size, char pattern) {
        super("Triangle", size, pattern);
    }

    @Override
    public void display() {
        StringBuilder line = new StringBuilder();

        for (int i = 1; i <= super.getSize(); i++) {
            line.append(super.getPattern()).append(" ");
            System.out.println(line);
        }
    }
}
