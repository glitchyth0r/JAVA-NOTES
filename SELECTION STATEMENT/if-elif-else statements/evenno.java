import java.util.Scanner;

public class evenno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER THE NUMBER :");
        int number = sc.nextInt();

        if ((number % 2) == 0) {
            System.out.println("even");
        } else {
            System.out.println("Odd");
        }
    }
}
