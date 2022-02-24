import java.util.Scanner;

public class Palindrome_or_Special_Word {
    public static void main(String[] args){
        int i, l;
        String w, r="";       //w=word , r=reverse

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Word: ");
        w = sc.next();       //inputing the word
        l= w.length() - 1;     //storing the last index of the word

        for(i=0;i<w.length();i++){
            r = w.charAt(i) + r;       //reversing the word
        }

        if(w.equals(r)){
            System.out.println("It is a Palindrome & Special Word.");
        }
        else if(w.charAt(0)==w.charAt(l)){
            System.out.println("It is only a Special Word.");
        }
        else{
            System.out.println("Neither Palindrome nor Special Word.");
        }
    }
}
