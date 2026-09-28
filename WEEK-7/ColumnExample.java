import java.util.*;
import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface Column {
    String name();
}

class Student {

    @Column(name = "Name")
    String name;

    @Column(name = "Age")
    int age;

    @Column(name = "Email")
    String email;
}

public class ColumnExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of columns: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] headers = new String[n];
        String[] data = new String[n];

        System.out.println("Enter column names:");
        for (int i = 0; i < n; i++) {
            headers[i] = sc.nextLine();
        }

        System.out.println("Enter data:");
        for (int i = 0; i < n; i++) {
            data[i] = sc.nextLine();
        }

        Student student = new Student();
        Field[] fields = Student.class.getDeclaredFields();

        for (Field field : fields) {

            try {

                Column column =
                        field.getAnnotation(Column.class);

                String columnName = column.name();

                boolean found = false;

                for (int i = 0; i < n; i++) {

                    if (headers[i].equals(columnName)) {

                        if (field.getType() == int.class) {

                            field.setInt(
                                    student,
                                    Integer.parseInt(data[i])
                            );

                        } else {

                            field.set(
                                    student,
                                    data[i]
                            );
                        }

                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println(
                            "Column missing: " + columnName
                    );
                }

            } catch (Exception e) {
                System.out.println("Error while processing data");
            }
        }

        System.out.println("\nStudent Details:");
        System.out.println("Name: " + student.name);
        System.out.println("Age: " + student.age);
        System.out.println("Email: " + student.email);
        sc.close();
    }
}