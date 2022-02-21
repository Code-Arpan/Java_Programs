import java.util.Scanner;

public class SortingArray {
    public static void main(String[] args){
        int i, j, min;
        String t;
        Scanner sc = new Scanner(System.in);
        String ar[] = new String[5];
        for(i=0;i<ar.length;i++){
            ar[i]= sc.next();
        }

        for(i=0;i<ar.length;i++){
            min=i;
            for(j=i+1;j<ar.length;j++){
                if(ar[i].compareTo(ar[j])<0){
                    min=j;
                }
            }
            t=ar[i];
            ar[i]=ar[min];
            ar[min]=t;
        }
        for(i=0;i<ar.length;i++){
            System.out.println(ar[i]+" ");
        }
    }
}
