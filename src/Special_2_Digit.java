import java.util.Scanner;

public class Special_2_Digit {
    static void Special_num(int n) {
        int sum = 0, prod = 1, D1, D2;
        if (n >= 10 && n < 100) {
            D1 = n / 10;
            D2 = n % 10;
            sum = D1 + D2;
            prod = D1 * D2;
            if (sum + prod == n) {
                System.out.println("Special 2-digit number");
            } else {
                System.out.println("Not a special 2-digit number");
            }
        }
        else{
            System.out.println("Invalid!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a two digit number: ");
        int N = sc.nextInt();
        Special_num(N);
    }
}
