import java.util.Scanner;

public class Count {
    public static void main(String args[]){
        String sen;
        int i,c=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a Sentence");
        sen = sc.nextLine();
        sen = sen.toUpperCase();
        sen = " " + sen;
        for(i=0;i<sen.length();i++){
            if(sen.charAt(i)==' ' && sen.charAt(i+1)=='A'){
                c++;
            }
        }
        System.out.println("Total number of words starting with 'A'= "+c);
    }
}
