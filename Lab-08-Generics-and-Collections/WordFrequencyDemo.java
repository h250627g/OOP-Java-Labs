
import java.util.*;

public class WordFrequencyDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a paragraph:");
        String paragraph = input.nextLine().toLowerCase();

        String[] words = paragraph.split("[^a-z0-9']+");
        Map<String, Integer> frequency = new HashMap<>();

        for (String word : words) {
            if (!word.isBlank()) {
                frequency.put(
                    word, frequency.getOrDefault(word, 0) + 1
                );
            }
        }

        List<Map.Entry<String, Integer>> sorted =
            new ArrayList<>(frequency.entrySet());

        sorted.sort((a, b) -> {
            int comparison = Integer.compare(
                b.getValue(), a.getValue()
            );

            if (comparison == 0) {
                return a.getKey().compareTo(b.getKey());
            }

            return comparison;
        });

        System.out.println("Word frequencies (highest first):");

        for (Map.Entry<String, Integer> entry : sorted) {
            System.out.println(
                entry.getKey() + ": " + entry.getValue()
            );
        }

        input.close();
    }
}
