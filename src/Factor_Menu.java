import java.util.Scanner;

public class Factor_Menu {
    public static void main(String[] args){
        int ch, n, i, p=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Choice: \n 1.Factors  \n 2.Factorial");
        ch = sc.nextInt();   //inputing choice
        System.out.println("Enter a Number: ");
        n = sc.nextInt();

        switch (ch) {
            case 1 -> { //finds factor of a number
                System.out.print("Factors of " + n + " is : ");
                for (i = 1; i < n; i++) {
                    if (n % i == 0) {
                        System.out.print(i + ", ");
                    }
                }
            }
            case 2 -> { //finds factorial of a number
                System.out.print(n + "! = ");
                for (i = 1; i <= n; i++) {
                    p *= i;
                    if (i < n) {
                        System.out.print(i + " x ");
                    } else {
                        System.out.print(i + " = ");
                    }
                }
                System.out.println(p);
            }
            default -> System.out.println("Invalid Choice");
        }
    }
}
