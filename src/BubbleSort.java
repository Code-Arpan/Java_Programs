import java.util.*;
class BubbleSort{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int i, j ,t, n;
        int ar[]=new int[5];
        n=ar.length;
        System.out.println("Input Array Elements:");
        for(i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }

        for(i=0;i<n;i++)
        {
            for(j=0;j<n-1-i;j++)
            {
                if(ar[j]>ar[j+1])
                {
                    t=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=t;
                }
            }
        }
        for(i=0;i<n;i++)
        {
            System.out.print(ar[i]+" ");
        }
    }
}