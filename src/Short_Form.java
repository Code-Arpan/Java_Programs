import java.util.Scanner;

public class Short_Form {
    public static void main(String[] args) {
        String sen, sf="";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Sentence: ");
        sen = sc.nextLine();
        sen = " " + sen;     //ading one space before the sentence

        for(int i=0;i<sen.length();i++){
            if(sen.charAt(i) == ' '){
                sf+=sen.charAt(i+1)+".";  //adding the character after every space with a '.'
            }
        }

        sf = sf.toUpperCase();
        System.out.println("First Letters: "+sf);
    }
}
