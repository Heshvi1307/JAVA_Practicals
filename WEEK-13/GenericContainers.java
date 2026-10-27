
import java.util.Scanner;

class Box<T> {
    private T value;

    void set(T value) {
        this.value = value;
    }

    T get() {
        return value;
    }
}

class Pair<A, B> {
    A first;
    B second;

    Pair(A first, B second) {
        this.first = first;
        this.second = second;
    }

    void display() {
        System.out.println("First value: " + first);
        System.out.println("Second value: " + second);
    }
}

public class GenericContainers {
    static <T> T firstElement(T[] array) {
        if (array.length == 0) {
            return null;
        }
        return array[0];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Box<String> nameBox = new Box<>();
        System.out.print("Enter a name for the box: ");
        nameBox.set(sc.nextLine());

        Box<Integer> numberBox = new Box<>();
        System.out.print("Enter a number for the box: ");
        numberBox.set(Integer.parseInt(sc.nextLine()));

        System.out.println("\nBox contents:");
        System.out.println("Name: " + nameBox.get());
        System.out.println("Number: " + numberBox.get());

        System.out.print("\nEnter your age: ");
        int age = Integer.parseInt(sc.nextLine());

        System.out.print("Enter your city: ");
        String city = sc.nextLine();

        Pair<Integer, String> person = new Pair<>(age, city);
        System.out.println("\nPair details:");
        person.display();

        System.out.print("\nEnter number of fruits: ");
        int n = Integer.parseInt(sc.nextLine());

        String[] fruits = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter fruit " + (i + 1) + ": ");
            fruits[i] = sc.nextLine();
        }

        if (fruits.length > 0) {
            System.out.println("First fruit: " +
                    firstElement(fruits));
        } else {
            System.out.println("No fruits entered.");
        }

        sc.close();
    }
}
