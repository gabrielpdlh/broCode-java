import java.util.Scanner;

public class MathClasses {
    public static void main(String[] args) {

        // HYPOTENUSE c = Math.sqrt((a * a) + (b * b))

        Scanner scanner = new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.print("Enter the length of side A: ");
        a = scanner.nextDouble();

        System.out.print("Enter the length of side B: ");
        b = scanner.nextDouble();

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b,2));

        System.out.println("The hypotenuse is: " + c);

        scanner.close();
    }
}