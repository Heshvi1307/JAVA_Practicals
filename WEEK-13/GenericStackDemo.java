
import java.util.Scanner;

class MyStack<T> {
    private Object[] items;
    private int top;

    MyStack(int size) {
        items = new Object[size];
        top = -1;
    }

    public void push(T value) {
        if (top == items.length - 1) {
            System.out.println("Stack is full!");
            return;
        }

        items[++top] = value;
        System.out.println("Added: " + value);
    }

    @SuppressWarnings("unchecked")
    public T pop() {
        if (top == -1) {
            System.out.println("Stack is empty!");
            return null;
        }

        T value = (T) items[top];
        items[top] = null;
        top--;
        return value;
    }

    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty!");
            return;
        }

        System.out.println("Stack contents (top to bottom):");
        for (int i = top; i >= 0; i--) {
            System.out.println(items[i]);
        }
    }
}

public class GenericStackDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MyStack<String> names = new MyStack<>(5);

        System.out.print("How many names do you want to enter (0-5)? ");
        int n = sc.nextInt();
        sc.nextLine();

        if (n < 0 || n > 5) {
            System.out.println("Please enter a number between 0 and 5.");
        } else {
            for (int i = 0; i < n; i++) {
                System.out.print("Enter name " + (i + 1) + ": ");
                names.push(sc.nextLine());
            }

            names.display();

            System.out.print("Do you want to remove a name? (yes/no): ");
            String choice = sc.nextLine();

            if (choice.equalsIgnoreCase("yes")) {
                String removed = names.pop();

                if (removed != null) {
                    System.out.println("Removed name: " + removed);
                }
            }
        }

        System.out.println("\nTesting stack with integers:");

        MyStack<Integer> numbers = new MyStack<>(3);

        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        numbers.push(number);
        System.out.println("Popped number: " + numbers.pop());

        System.out.println("Trying to pop again:");
        numbers.pop();

        sc.close();
    }
}
