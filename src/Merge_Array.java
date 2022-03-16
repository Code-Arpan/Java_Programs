import java.util.*;

public class Merge_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] Pr =new int[5];
        int[] Qr =new int[5];
        int[] Sr =new int[10];

        System.out.println("Input 1st Array Elements:");
        for(int i=0;i< Pr.length;i++)
        {
            Pr[i]=Integer.parseInt(sc.next());
            Sr[i]=Pr[i];
        }

        System.out.println("Input 2nd Array Elements:");
        for(int i=0;i< Qr.length;i++)
        {
            Qr[i]=Integer.parseInt(sc.next());
            Sr[i+5]=Qr[i];
        }

        System.out.println("1st Array Elements: "+Arrays.toString(Pr));
        System.out.println("2nd Array Elements: "+Arrays.toString(Qr));

        Arrays.sort(Sr);
        System.out.println("\nMerged Array Elements are:\n"+Arrays.toString(Sr));
    }
}
