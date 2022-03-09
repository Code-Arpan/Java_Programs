import java.util.Scanner;

public class First_Letter{
    public static void main(String[] args) {
        String sen, fls="";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Sentence: ");
        sen = sc.nextLine();
        sen = " " + sen;     //ading one space before the sentence

        for(int i=0;i<sen.length();i++){
            if(sen.charAt(i) == ' '){
                fls+=sen.charAt(i+1)+".";  //adding the character after every space with a '.'
            }
        }

        fls = fls.toUpperCase();
        System.out.println("First Letters: "+fls);
    }
}
