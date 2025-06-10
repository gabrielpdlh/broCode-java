public class Method {
    public static void main (String[] args){

     String name = "Gabriel";
     int age = 20;

     double result = square(3);
     System.out.println(result);

    }

    static void happyBirthday(String name, int age){
        System.out.println("Happy Birthday yo you!");
        System.out.printf("Happy Birthday, dear %s!\n", name);
        System.out.printf("You are %d years old", age);
    }
    static double square(double number){
        return number * number;
    }

}
