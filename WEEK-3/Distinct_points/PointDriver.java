import java.util.*;
public class PointDriver {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of points: ");
        int n = sc.nextInt();

        Point[] points = new Point[n];

        for (int i = 0; i < n; i++) {

            System.out.println("\nPoint " + (i + 1));

            System.out.print("Enter x: ");
            int x = sc.nextInt();

            System.out.print("Enter y: ");
            int y = sc.nextInt();

            points[i] = new Point(x, y);
        }

        int distinct = 0;

        for (int i = 0; i < points.length; i++) {

            boolean found = false;

            for (int j = 0; j < i; j++) {

                if (points[i].equals(points[j])) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                distinct++;
            }
        }

        System.out.println("\nDistinct: " + distinct);

        sc.close();
    }
}
