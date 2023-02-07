import java.util.Scanner;

public class LastDigit {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = in.nextInt();
        System.out.println(Math.abs(num % 10));

    }
}
