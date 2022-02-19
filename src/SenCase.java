import java.util.Scanner;

public class SenCase {
    public static void main(String args[]){
        int i, l;
        String s, w;
        char ch;
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine().toLowerCase();
        s+= " ";
        l=s.length();

        for(i=0;i<l;i++)
        {
            w="";
            while(s.charAt(i)!=' '){
                w+=s.charAt(i);
                i++;
            }
            ch = w.charAt(0);
            ch-=32;
            w= ch+ w.substring(1);
            System.out.print(w+" ");
        }
    }
}
