
import java.util.Scanner;

public class Double_Letter_Seq {
    public static void main(String[] args) {
        int len, c=0, i;
        String Sen;
        Scanner sc = new Scanner(System.in);
        Sen = sc.nextLine();
        Sen = Sen.toUpperCase();
        len = Sen.length();

        for(i=0;i<len-1;i++){
            if(Sen.charAt(i) == Sen.charAt(i+1)){
                c++;
            }
        }
        System.out.println("There are "+c+" Double Letter Sequences.");
    }
}
