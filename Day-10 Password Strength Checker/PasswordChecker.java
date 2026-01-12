import java.util.*;

class PasswordStrengthChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        if (password.length() >= 8) {

            for (int i = 0; i < password.length(); i++) {
                char ch = password.charAt(i);

                if (Character.isUpperCase(ch)) {
                    hasUpper = true;
                } else if (Character.isLowerCase(ch)) {
                    hasLower = true;
                } else if (Character.isDigit(ch)) {
                    hasDigit = true;
                } else {
                    hasSpecial = true;
                }
            }

            int strength = 0;
            if (hasUpper) strength++;
            if (hasLower) strength++;
            if (hasDigit) strength++;
            if (hasSpecial) strength++;

            System.out.println("\nPassword Analysis:");
            System.out.println("Uppercase: " + hasUpper);
            System.out.println("Lowercase: " + hasLower);
            System.out.println("Digit: " + hasDigit);
            System.out.println("Special Character: " + hasSpecial);

            if (strength == 4) {
                System.out.println("\nPassword Strength: STRONG");
            } else if (strength >= 2) {
                System.out.println("\nPassword Strength: MEDIUM");
            } else {
                System.out.println("\nPassword Strength: WEAK");
            }

        } else {
            System.out.println("\nPassword too short (minimum 8 characters required)");
        }

        sc.close();
    }
}