import java.util.Scanner;

public class IsEven {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = in.nextInt();
        if (n % 2 == 0)
            System.out.println("2");
        else 
            System.out.println("1");
    }
}
