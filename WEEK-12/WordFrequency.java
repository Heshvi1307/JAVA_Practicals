
import java.util.*;

public class WordFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a paragraph:");
        String paragraph = sc.nextLine().toLowerCase();

        paragraph = paragraph.replaceAll("[^a-z0-9\\s]", " ");
        String[] words = paragraph.trim().split("\\s+");

        HashMap<String, Integer> count = new HashMap<>();

        for (String word : words) {
            if (!word.isEmpty()) {
                count.put(word, count.getOrDefault(word, 0) + 1);
            }
        }

        List<Map.Entry<String, Integer>> list = new ArrayList<>(count.entrySet());

        list.sort(new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> a,
                    Map.Entry<String, Integer> b) {
                int result = b.getValue().compareTo(a.getValue());

                if (result == 0) {
                    return a.getKey().compareTo(b.getKey());
                }

                return result;
            }
        });

        System.out.println("\nWord Frequencies:");

        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + " : " +
                    entry.getValue());
        }

        sc.close();
    }
}
