
import java.nio.file.*;
import java.io.IOException;
import java.util.Scanner;

public class LogAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter number of log files: ");
            int n = Integer.parseInt(sc.nextLine());

            Path folder = Paths.get("mylogs");
            Files.createDirectories(folder);

            for (int i = 1; i <= n; i++) {
                System.out.print("\nEnter file name: ");
                String name = sc.nextLine();

                Path file = folder.resolve(name);

                System.out.print("Enter number of lines: ");
                int lines = Integer.parseInt(sc.nextLine());

                StringBuilder content = new StringBuilder();

                for (int j = 1; j <= lines; j++) {
                    System.out.print("Enter line " + j + ": ");
                    content.append(sc.nextLine())
                            .append(System.lineSeparator());
                }

                Files.writeString(file, content.toString());
            }

            System.out.print("\nEnter keyword to search: ");
            String keyword = sc.nextLine().toLowerCase();

            int totalLines = 0;
            int matchedLines = 0;

            try (DirectoryStream<Path> files = Files.newDirectoryStream(folder, "*.txt")) {

                for (Path file : files) {
                    System.out.println("\nFile: " + file.getFileName());
                    System.out.println("Size: " +
                            Files.size(file) + " bytes");

                    for (String line : Files.readAllLines(file)) {
                        totalLines++;

                        if (line.toLowerCase().contains(keyword)) {
                            matchedLines++;
                        }
                    }
                }
            }

            System.out.println("\nTotal lines: " + totalLines);
            System.out.println("Matching lines: " + matchedLines);

        } catch (IOException | NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
