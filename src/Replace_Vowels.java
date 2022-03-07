import java.util.Scanner;

public class Replace_Vowels {
    public static void main(String[] args) {
        String word;
        int i, l, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Word: ");
        word = sc.next();
        word = word.toLowerCase();
        l = word.length();

        for(i=0;i<l;i++){
            char x = word.charAt(i);
            if(x=='a' || x=='e' || x=='i' || x=='o' || x=='u'){
                n = (int)x + 1;
                word = word.replace(x, (char)n);
            }
        }
        System.out.println(word);
    }
}
