import java.util.Scanner;

public class Count_x_Words {
    public static void main(String[] args){
        int i, c=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a Sentence: ");
        String sen = sc.nextLine();
        System.out.print("Input a Character to Count: ");
        char x = sc.next().charAt(0);
        sen = sen.toUpperCase();
        sen = " " + sen;

        for(i=0;i<sen.length();i++){
            if(sen.charAt(i)==' ' && sen.charAt(i+1)==x){
                c++;
            }
        }
        System.out.println("Total number of words starting with '"+x+"' = "+c);
    }
}
