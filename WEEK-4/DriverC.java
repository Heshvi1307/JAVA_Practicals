import java.util.Scanner;
public class DriverC {
    public static void main(String[] args) {

        String[] logs = {
                "10:05 user1 Please submit the assignment by today",
                "10:10 user2 The project meeting is scheduled for tomorrow",
                "10:15 user3 Please check the updated notes",
                "10:20 user4 The assignment deadline has been extended",
                "10:25 user5 Please bring your documents to the meeting",
                "10:30 Invalid"
        };

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter keyword: ");
        String keyword = sc.nextLine();

        int count = 0;
        StringBuilder report = new StringBuilder();

        for (String line : logs) {

            String[] parts = line.split(" ", 3);

            // Skip malformed lines
            if (parts.length < 3) {
                continue;
            }

            String time = parts[0];
            String user = parts[1];
            String message = parts[2];

            if (Chatfilter.containsKeyword(message, keyword)) {
                count++;

                report.append(time)
                        .append(" ")
                        .append(user)
                        .append(": ")
                        .append(message)
                        .append("\n");
            }
        }

        System.out.println("Matches: " + count);
        System.out.println(report);

        sc.close();
    }
}
