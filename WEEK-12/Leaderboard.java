
import java.util.*;

public class Leaderboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of players: ");
        int n = sc.nextInt();
        sc.nextLine();

        Map<String, Integer> scores = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter player name: ");
            String name = sc.nextLine();

            System.out.print("Enter score: ");
            int score = sc.nextInt();
            sc.nextLine();

            scores.put(name, score);
        }

        System.out.print("Enter top N players to display: ");
        int topN = sc.nextInt();

        List<Map.Entry<String, Integer>> players = new ArrayList<>(scores.entrySet());

        players.sort(new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> a,
                    Map.Entry<String, Integer> b) {
                int result = b.getValue().compareTo(a.getValue());

                if (result == 0) {
                    return a.getKey().compareTo(b.getKey());
                }

                return result;
            }
        });

        System.out.println("\nLEADERBOARD");

        int limit = Math.min(topN, players.size());

        for (int i = 0; i < limit; i++) {
            Map.Entry<String, Integer> player = players.get(i);

            System.out.println((i + 1) + ". " +
                    player.getKey() + " - " + player.getValue());
        }

        sc.close();
    }
}
