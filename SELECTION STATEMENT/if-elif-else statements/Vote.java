import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("age of the user : ");

        int age = sc.nextInt();
        if (age == 0) {
            System.out.println("You are not born yet date");
        } else if (age < 18) {
            System.out.println("You are not eligible for vote");
        } else {
            System.out.println("You are  eligible for vote");
        }
    }
}