import java.util.Scanner;
/*
   A Pronic number is a number which is the product of two consecutive integers,
   that is, a number n = i * (i+1)
*/
public class PronicNumber {
    public static void main(String[] args){
        int i, flag=0, n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        n=sc.nextInt();

        for(i=0;i<n;i++)
        {
            if(i*(i+1)==n)
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
            System.out.println(n+" is a Pronic Number.");

        else
            System.out.println(n+" is not a Pronic Number.");
    }
}
