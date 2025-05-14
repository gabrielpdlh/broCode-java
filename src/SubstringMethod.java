import java.util.Scanner;

public class SubstringMethod {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);

        String email;
        String username;
        String domain;

        System.out.print("Please enter your email: ");
        email = scanner.nextLine();

        System.out.println("Your username is :" + email.substring(0, email.indexOf("@")));
        System.out.println("Your domain is: "+ email.substring(email.indexOf("@") + 1));
    }
}

