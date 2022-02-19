import java.util.*;
class SelectionSort
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);


        int ar[]=new int [5];
        int t, n;

        //Inputing array elements
        System.out.println("Input array elements:");
        for (int i=0; i<ar.length; i++)
            ar[i]=sc.nextInt();

        //Taking the length of Array
        n=ar.length;

        //sorting the array elements
        for (int k=0;k<n-1; k++)
        {
            //checking with the rest of elements for (int p=k+1; p<n;p++)
            for(int p=k+1;p<n;p++)
            {
                if (ar[k]>ar[p]) //this line decides ascending & descending sorting
                {
                    //exchanging the values
                    t=ar[k];
                    ar[k]=ar[p];
                    ar[p]=t;
                }
            }
        }
        //printing sorted elements
        System.out.println("Sorted elements:");
        for (int i=0;i<n;i++)
            System.out.print(ar[i]+" ");
    }
}