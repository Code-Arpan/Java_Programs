import java.util.Scanner;

public class StringOverload {
    static void check(String str, char ch){
        int i, f=0, l;
        l=str.length();

        for(i=0;i<l;i++){
            if(str.charAt(i)==ch){
                f++;
            }
        }
        System.out.println("Number of "+ch+" present is = "+f);
    }

    static void check(String s1){
        int i, l;
        char x;

        s1=s1.toLowerCase();
        l=s1.length();

        for(i=0;i<l;i++){
            x=s1.charAt(i);
            if(x=='a' || x=='e' || x=='i' || x=='o' || x=='u'){
                System.out.print(x+" "); //vowels present in the string
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input String");
        String a= sc.nextLine();
        System.out.println("Input character"); //to find its frequency in the string
        char b=sc.next().charAt(0);
        check(a, b);
        check(a);

    }
}
