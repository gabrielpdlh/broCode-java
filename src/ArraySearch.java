import java.util.Scanner;

public class ArraySearch {
    public static void main (String []args){
        Scanner scanner = new Scanner(System.in);
        String[] fruits = {"orange", "grapes", "strawberry", "banana"};
        String target;
        boolean isFound = false;

        System.out.print("Enter a fruit to search in an array: ");
        target = scanner.nextLine();

        for(int i = 0; i < fruits.length ; i++){
            if(fruits[i].equals(target)){
                System.out.print("Element found at  index: " + i);
                isFound = true;
            }
        }

        if (!isFound){
            System.out.println("Element not found!");
        }

    }
}
