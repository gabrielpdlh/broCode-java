import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample1 {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        String newFood;

        String[] foods = new String[3];

        for(int i = 0; i < foods.length; i++){
            System.out.print("Enter the food you want to add: ");
            foods[i] = scanner.nextLine();
        }

        for(String food: foods){
            System.out.println(food);
        }

        scanner.close();
    }
}
