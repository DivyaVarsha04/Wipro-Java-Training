import java.util.Scanner;

public class SecondLastDigit {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num =in.nextInt();
        if(num<0)
        {
            num=num*(-1);
        }
        int cnt=0,rem=0;
        int len=Integer.toString(num).length();
        if(len==1)
        System.out.println("-1");
        else{
            while(num>0)
            {
                rem=num%10;
                cnt++;
                num/=10;
                if(cnt==2) break;
            }
        }System.out.println(rem);

    }
}
