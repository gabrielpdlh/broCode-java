import java.util.Arrays;

public class ArrayMethods {
    public static void main (String []args){
        String[] fruits = {"apple", "orange", "banana", "coconut"};

        //fuits[0] = "pineapple"
        //int numOfFruits = fruits.length;
        //Arrays.sort(fruits);
        Arrays.fill(fruits, "pineapple");

        for(String fruit : fruits){
            System.out.println(fruit);
        }
    }
}
