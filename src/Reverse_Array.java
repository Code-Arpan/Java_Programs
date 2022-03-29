import java.util.Arrays;

public class Reverse_Array {
    public static void main(String[] args) {
        int[] ar = {1,2,3,4,5};
        int i= ar.length-1, j =0, t;

        while(i>= ar.length/2){
            t=ar[j];
            ar[j]=ar[i];
            ar[i]=t;
            i--; j++;
        }
        System.out.println(Arrays.toString(ar));
    }
}
