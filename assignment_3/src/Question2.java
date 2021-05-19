import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.UnaryOperator;

public class Question2 {
    public static void main(String[] args) throws IOException {
        List<String> sortedWords = processFile(words -> {
            words.sort(Comparator.comparing(String::length).reversed());
            return words;
        });

        System.out.println(sortedWords.get(0));

        int wordCount = processFile(words -> words).size();

        System.out.println(wordCount);
    }

    public static List<String> processFile(UnaryOperator<List<String>> operator) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("call_of_the_wild.txt"), StandardCharsets.UTF_8);

        StringBuilder stringBuilder = new StringBuilder();
        for (String line : lines) {
            String preprocessedLine = line.strip().replaceAll("[,.]", "");
            if (preprocessedLine.length() > 0)
                stringBuilder.append(preprocessedLine).append(" ");
        }

        List<String> words = Arrays.asList(stringBuilder.toString().split("[ ]+"));
        return operator.apply(words);
    }
}