public class DriverP {

    public static void main(String[] args) {

        String[] passwords = {
                "abc",
                "abcdefghi",
                "Abcd1234",
                "Abcd1234!"
        };

        for (String pw : passwords) {

            System.out.println("\nPassword: " + pw);

            System.out.println("Length >= 8: "
                    + PasswordChecker.hasLength(pw));

            System.out.println("Contains uppercase: "
                    + PasswordChecker.hasUppercase(pw));

            System.out.println("Contains digit: "
                    + PasswordChecker.hasDigit(pw));

            System.out.println("Contains special character: "
                    + PasswordChecker.hasSpecialCharacter(pw));

            System.out.println("Strength: "
                    + PasswordChecker.strength(pw));
        }
    }
}