import java.util.Scanner;

public class For {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter how many times do u want to loop: ");
        int max = scanner.nextInt();

        for(int i = 0; i <= max; i++){
            System.out.println("I am being looping " +  i + " times!");
        }

        scanner.close();

    }
}
