
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FolderReport {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter folder path: ");
        Path folder = Paths.get(sc.nextLine());

        if (!Files.isDirectory(folder)) {
            System.out.println("Invalid folder path!");
            sc.close();
            return;
        }

        Path report = Paths.get("folder_report.txt");

        try (PrintWriter out = new PrintWriter(
                Files.newBufferedWriter(report))) {

            out.println("FOLDER CONTENT REPORT");
            out.println("Folder: " + folder.toAbsolutePath());
            out.println("--------------------------------");

            Files.walkFileTree(folder,
                    new SimpleFileVisitor<Path>() {

                        @Override
                        public FileVisitResult visitFile(
                                Path file, BasicFileAttributes attr) {

                            out.println("File name: " + file.getFileName());
                            out.println("Full path: " + file);
                            out.println("Size: " + attr.size() + " bytes");
                            out.println("Modified: " +
                                    attr.lastModifiedTime());
                            out.println("--------------------------------");

                            return FileVisitResult.CONTINUE;
                        }

                        @Override
                        public FileVisitResult visitFileFailed(
                                Path file, IOException e) {

                            out.println("Cannot access: " + file);
                            return FileVisitResult.CONTINUE;
                        }
                    });

            System.out.println("Report created successfully.");
            System.out.println("Saved as: " +
                    report.toAbsolutePath());

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
