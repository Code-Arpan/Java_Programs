import java.util.Scanner;

public class PatternMenu {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Choice: \n 1.ABCDE \n 2.BLUE");
        int ch = sc.nextInt();

        switch(ch) {
            case 1:
                String s ="ABCDE";
                for(int i = s.length(); i > 0;i--){
                System.out.println(s.substring(0, i));
            }
            break;

            case 2:
                String s1 = "BLUE";
                for (int i = 0; i < s1.length(); i++) {
                    for (int j = 0; j <= i; j++) {
                        System.out.print(s1.charAt(i));
                    }
                    System.out.println();
                }
                break;

            default:
                System.out.println("Wrong Choice");


        }
    }
}

