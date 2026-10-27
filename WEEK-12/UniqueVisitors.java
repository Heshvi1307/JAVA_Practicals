import java.util.*;

public class UniqueVisitors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of login entries: ");
        int n = sc.nextInt();
        sc.nextLine();

        HashSet<String> uniqueUsers = new HashSet<>();
        LinkedHashSet<String> orderedUsers = new LinkedHashSet<>();

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter login name " + i + ": ");
            String name = sc.nextLine();

            uniqueUsers.add(name);
            orderedUsers.add(name);
        }

        System.out.println("\nTotal unique users: " +
                uniqueUsers.size());

        System.out.println("First three distinct users:");

        int shown = 0;

        for (String name : orderedUsers) {
            if (shown == 3) {
                break;
            }

            System.out.println(name);
            shown++;
        }

        sc.close();
    }
}
