import java.io.*;
import java.util.Scanner;

class Student implements Serializable {
    int rollNo;
    String name;
    transient String password;

    Student(int rollNo, String name, String password) {
        this.rollNo = rollNo;
        this.name = name;
        this.password = password;
    }

    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Password: " + password);
        System.out.println();
    }
}

public class SaveLoadDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of student " + (i + 1));

            System.out.print("Roll number: ");
            int roll = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Password: ");
            String password = sc.nextLine();

            students[i] = new Student(roll, name, password);
        }

        try {
            ObjectOutputStream out = new ObjectOutputStream(
                    new FileOutputStream("students.dat"));

            out.writeObject(students);
            out.close();

            System.out.println("\nObjects saved successfully.");

            ObjectInputStream in = new ObjectInputStream(
                    new FileInputStream("students.dat"));

            Student[] loaded = (Student[]) in.readObject();
            in.close();

            System.out.println("\nLoaded student details:");

            for (Student s : loaded) {
                s.display();
            }

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}