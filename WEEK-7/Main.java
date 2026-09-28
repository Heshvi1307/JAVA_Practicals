import java.util.*;
import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface NotBlank {
}
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface MaxLength {
    int value();
}

class SignupForm {

    @NotBlank
    String name;

    @NotBlank
    @MaxLength(10)
    String username;

    @NotBlank
    String email;

    SignupForm(String name, String username, String email) {
        this.name = name;
        this.username = username;
        this.email = email;
    }
}

class FormValidator {

    static List<String> validate(Object obj) {

        List<String> errors = new ArrayList<>();

        Field[] fields = obj.getClass().getDeclaredFields();

        for (Field field : fields) {

            try {
                field.setAccessible(true);

                String value = (String) field.get(obj);

                if (field.isAnnotationPresent(NotBlank.class)) {

                    if (value == null || value.trim().isEmpty()) {
                        errors.add(field.getName() + " cannot be blank");
                    }
                }

                if (field.isAnnotationPresent(MaxLength.class)) {

                    MaxLength maxLength =
                            field.getAnnotation(MaxLength.class);

                    if (value != null &&
                        value.length() > maxLength.value()) {

                        errors.add(field.getName()
                                + " cannot be more than "
                                + maxLength.value()
                                + " characters");
                    }
                }

            } catch (Exception e) {
                System.out.println("Error while validating");
            }
        }

        return errors;
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter username: ");
        String username = sc.nextLine();

        System.out.print("Enter email: ");
        String email = sc.nextLine();

        SignupForm form =
                new SignupForm(name, username, email);

        List<String> errors =
                FormValidator.validate(form);

        if (errors.isEmpty()) {
            System.out.println("Signup successful");
        } else {
            System.out.println("Validation Errors:");

            for (String error : errors) {
                System.out.println(error);
            }
        }

        sc.close();
    }
}