public class Square extends Shape {

    public Square(int size, char pattern) {
        super("Square", size, pattern);
    }

    @Override
    public void display() {
        StringBuilder line = new StringBuilder();
        for (int j = 0; j < super.getSize(); j++) {
            line.append(super.getPattern()).append(" ");
        }

        for (int i = 1; i <= super.getSize(); i++) {
            System.out.println(line);
        }
    }
}
