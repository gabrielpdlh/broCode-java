import javax.swing.plaf.basic.BasicIconFactory;
import java.util.Scanner;

public class StringMethods {
    public static void main(String []args){

        Scanner scanner = new Scanner(System.in);

        String user;
        String password;

        System.out.print("Please enter your user");
        user = scanner.nextLine();

        System.out.print("Please enter your password");
        password = scanner.nextLine();


        if (user.contains(" ")){
            System.out.print("Alert! You username cant contains a space");
        }

        if(user.length() < 5){
            System.out.println("Alert! Your username must contain more than 5 characters");
        } else if(user.length() >= 10){
            System.out.println("Alert! Your username must contain less than 10 characters");
        }

        if (password.length() < 8) {
            System.out.println("Alert! Your password must contain more than 8 characters");
        }
        if (password.equals(user)) {
            System.out.println("Alert! Your password must be different of your username");
        }

    }
}
