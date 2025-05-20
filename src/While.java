import java.util.Scanner;

public class While {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        int age = 0;

        System.out.print("Please enter your age: ");
        age = scanner.nextInt();

        while (age < 18) {
            System.out.println("You must be older than 18 years to enter!");
            System.out.print("Enter your age again: ");
            age = scanner.nextInt();
        }

        System.out.println("You are in the game!");

        scanner.close();
    }
}
