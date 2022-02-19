import java.util.*;
class MergeArray
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);

        int Pr[]=new int[5];
        int Qr[]=new int[5];
        int Sr[]=new int[10];

        System.out.println("Input 1st Array Elements:");
        for(int i=0;i< Pr.length;i++)
        {
            Pr[i]=Integer.parseInt(sc.next());
            Sr[i]=Pr[i];
        }
        System.out.println("Input 2nd:");
        for(int i=0;i< Qr.length;i++)
        {
            Qr[i]=Integer.parseInt(sc.next());
            Sr[i+5]=Qr[i];
        }

        System.out.println("1st Array Elements are:");
        for(int i=0;i< Pr.length;i++)
            System.out.print(Pr[i]+", ");

        System.out.println();
        System.out.println("2nd Array Elements are:");
        for(int i=0;i< Qr.length-1;i++)
            System.out.print(Qr[i]+", ");
        System.out.println(Qr[4]);

        System.out.println();
        System.out.println("Merged Array Elements are:");
        for(int i=0;i< Sr.length-1;i++)
            System.out.print(Sr[i]+", ");
        System.out.println(Sr[9]);
    }
}