import java.util.Arrays;
import java.util.Scanner;

public class Min_Max_Array {
    public static void main(String[] args) {
        int i, t, n, max = 0, min = 0;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Array Length: ");
        n = sc.nextInt();
        int ar[] = new int[n];
        System.out.println("Enter Array Elements");
        for(i=0;i<n;i++){
            ar[i]= sc.nextInt();
        }
        System.out.println("Inputed Array: "+Arrays.toString(ar));

        for (int k=0;k<n-1; k++)  //sorting the array in ascending order
            {
                for(int p=k+1;p<n;p++)
            {
                if (ar[k]>ar[p])
                {
                    t=ar[k];
                    ar[k]=ar[p];
                    ar[p]=t;
                }
            }
        }
        System.out.println("\nMinimum Element: "+ar[0]+ "\nMaximum Element: "+ar[n-1]);

    }
}
