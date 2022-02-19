import java.util.Scanner;

public class Menu4 {
    public static void main(String args[]){
        int ch , i, j, x=2, sign=1;
        double S=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Choice \n 1.Series \n 2.Series");
        ch=sc.nextInt();

        switch (ch){
            case 1:
                for(i=1;i<=20;i++){
                    S+=Math.pow(x, i) * sign;
                    sign*=-1;
                }
                System.out.println("Sum of the Series:"+S);
                break;

            case 2:
                for(i=1;i<=5;i++){
                    for(j=1;j<=i;j++){
                        System.out.print("1");
                    }
                    System.out.print(" ");
                }
                break;

            default:
                System.out.println("Wrong Choice");

        }
    }
}
