import java.util.Scanner;

public class FindInArray {
    public static void main(String args[]){
        int i, l, s, sum=0;
        Scanner sc = new Scanner(System.in);
        int ar[]=new int[5];
        for(i=0;i<ar.length;i++) {
            ar[i] = sc.nextInt();
        }
        l=s=ar[0];
        for(i=0;i<ar.length;i++){
            sum+=ar[i];
            if(ar[i]>l){
                l=ar[i];
            }
            if(ar[i]<s){
                s=ar[i];
            }
        }
        System.out.println("Largest Element: "+l);
        System.out.println("Smallest Element: "+s);
        System.out.println("Sum of all Elements: "+sum);
    }
}
