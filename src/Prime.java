import java.util.Scanner;

public class Prime
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number:");
        int n = sc.nextInt();

        if(n==2 || n==3 || n==5)
        {
            System.out.println("Prime");
        }
        else if(n==0 || n==1 || n%2==0 || n%3==0 ||  n%4==0 || n%5==0)
        {
            System.out.println("Not prime");
        }
        else
        {
            System.out.println("Prime");
        }

    }

}
