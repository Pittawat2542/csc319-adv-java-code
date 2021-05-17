import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.function.Function;

public class Question1 {
    public static void main(String[] args) throws IOException {
        String result = new MyFile().processFile(bufferedReader -> {
            try {
                return bufferedReader.readLine() + bufferedReader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return "";
        });

        System.out.println(result);
    }
}

class MyFile {
    public String processFile(Function<BufferedReader, String> function) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("call_of_the_wild.txt"))) {
            return function.apply(bufferedReader);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
}