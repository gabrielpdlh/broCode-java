import java.util.Scanner;

public class LogicalOperators {
    public static void main(String [] args){

       Scanner scanner = new Scanner(System.in);

       String username;

       System.out.print("Please enter your new username: ");
       username = scanner.nextLine();

       if(username.length() < 4|| username.length() > 12){
           System.out.println("The username mus tbe between 4 - 12 characteres");
       } else {
           System.out.println("Welcome " + username);
       }

       scanner.close();

    }
}
