import java.util.Scanner;
public class PatternMenu2 {
    public static void main(String[] args){
        int ch, i, j, c=1;  //variables
        String s = "ICSE";

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Choice: \n 1.Floyd's Triangle \n 2.ICSE");
        ch=sc.nextInt();      //inputing choice

        switch (ch){
            case 1:                    //floyd's triangle
                for(i=1;i<=5;i++){
                    for(j=1;j<=i;j++){
                        System.out.print(c+ "\t");
                        c++;
                    }
                    System.out.println();
                }
                break;

            case 2:                      //icse triangle
                for(i=0;i<s.length();i++){
                    for(j=0;j<=i;j++){
                        System.out.print(s.charAt(j));
                    }
                    System.out.println();
                }
                break;

            default:
                System.out.println("Wrong Choice");

        }
    }
}
