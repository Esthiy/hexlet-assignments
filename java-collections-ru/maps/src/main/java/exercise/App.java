package exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;

// BEGIN
class App {
    public static Map<String, Integer> getWordCount(String sentence) {
        if (sentence.isEmpty()) {
            return Collections.emptyMap();
        }

        return Arrays.stream(sentence.split("\\s"))
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(word -> word, Collectors.summingInt(v -> 1)));
    }

    public static String toString(Map<String, Integer> wordsCount) {
        var words = wordsCount.keySet().stream().sorted().toList();

        if (words.isEmpty()) {
            return "{}";
        }

        var result = new StringBuilder("{\n");
        for (var word : words) {
            result.append("  ");
            result.append(word);
            result.append(": ");
            result.append(wordsCount.get(word));
            result.append("\n");
        }

        return result.append("}").toString();
    }
}
//END
