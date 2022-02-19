import java.util.Scanner;

public class Pronic {
    public static void main(String args[]){
        int i, flag=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int n=sc.nextInt();

        for(i=0;i<n;i++)
        {
            if(i*(i+1)==n)
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
            System.out.println("Pronic Number");

        else
            System.out.println("Not Pronic Number");

    }
}
