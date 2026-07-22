import java.util.Scanner;

public class age {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("ENTER YOUR AGE :");
        int age = scan.nextInt();

        if (age < 18) {
            System.out.println("You are less than 18 years old");
        } else if (age > 18) {
            System.out.println("You are greater than 18 years old");
        } else {
            System.out.println("You are not born yet");
        }
    }
}
