import java.util.Scanner;

public class Niven_Number {
    public static void main(String[] args)
    {
        int n, sum=0, i, d;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        n=in.nextInt();

        for(i=n;i>0;i=i/10)
        {
            d=i%10;
            sum+=d;    //calculating the sum of every digit of the inputed number
        }
        if(n%sum==0)  //condition for Niven number
            System.out.println("It is Niven Number");
        else
            System.out.println("It is not Niven Number");
    }
}
