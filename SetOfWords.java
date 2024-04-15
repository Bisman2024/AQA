import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SetOfWords {
    public static void main(String[] args) {
        String[] wordsArray = {
                "apple", "banana", "apple", "orange", "mango", "banana",
                "cherry", "grape", "lemon", "mango", "lemon", "apple",
                "watermelon", "strawberry", "nectarine", "peach",
                "orange", "grape", "lemon", "peach"
        };
        Set<String> uniqueWords = new HashSet<>();
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : wordsArray) {
            uniqueWords.add(word);
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        System.out.println("Уникальные слова:");
        for (String word : uniqueWords) {
            System.out.println(word);
        }
        System.out.println();
        System.out.println("Количество повторов каждого слова:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}