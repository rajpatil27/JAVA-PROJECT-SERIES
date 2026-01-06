import java.util.*;

class LoginSystem {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        String correctusername = "admin";
        String correctpassword = "admin123";

        int attempts = 3;

        while (attempts > 0) {

            System.out.println("Enter Username :-  ");
            String username = sc.nextLine();

            System.out.println("Enter Password:-  ");
            String password = sc.nextLine();

            if(username.equals(correctusername) && password.equals(correctpassword)){
                System.out.println("Login Successfull");
                return;
            } else {
                attempts --;
                System.out.println("Invalid Credentials");
                System.out.println("Attempts left =  " + attempts);

            }

        }
        System.out.println("Account Locked. Too many Failed Attempts");
        sc.close();

    }
}