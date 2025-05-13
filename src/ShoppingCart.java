import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int amount;

        System.out.print("What item would you like to buy?: ");
        item = scanner.nextLine();

        System.out.print("What is the price for each?: ");
        price = scanner.nextDouble();

        System.out.print("How many would you like?: ");
        amount = scanner.nextInt();

        double total = price * amount;

        System.out.println("\nYou have bought " + amount + " "  + item + "/s");
        System.out.println("Your total is $" + total);

    scanner.close();
    }
}
