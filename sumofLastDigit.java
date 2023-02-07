import java.util.Scanner;

public class sumofLastDigit {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 =in.nextInt();
        System.out.println("Enter the Second number:");
        int num2 =in.nextInt();
        num1=Math.abs(num1%10);
        num2=Math.abs(num2%10);        
        int result=num1+num2;
   System.out.println(result);


    }
    
}
