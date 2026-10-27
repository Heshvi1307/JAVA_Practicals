
import java.util.Scanner;

public class BoundedStats {
    static <N extends Number> double average(N[] values) {
        if (values.length == 0) {
            return 0.0;
        }

        double sum = 0;

        for (N value : values) {
            sum += value.doubleValue();
        }

        return sum / values.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of integer values: ");
        int n = Integer.parseInt(sc.nextLine());

        Integer[] integers = new Integer[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            integers[i] = Integer.parseInt(sc.nextLine());
        }

        System.out.print("\nEnter number of decimal values: ");
        int d = Integer.parseInt(sc.nextLine());

        Double[] decimals = new Double[d];

        for (int i = 0; i < d; i++) {
            System.out.print("Enter decimal value " + (i + 1) + ": ");
            decimals[i] = Double.parseDouble(sc.nextLine());
        }

        System.out.print("\nEnter number of long values: ");
        int l = Integer.parseInt(sc.nextLine());

        Long[] longs = new Long[l];

        for (int i = 0; i < l; i++) {
            System.out.print("Enter long value " + (i + 1) + ": ");
            longs[i] = Long.parseLong(sc.nextLine());
        }

        System.out.println("\nAverages:");
        System.out.println("Integer average: " + average(integers));
        System.out.println("Double average: " + average(decimals));
        System.out.println("Long average: " + average(longs));

        sc.close();
    }
}
