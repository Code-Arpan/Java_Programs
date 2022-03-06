import java.util.Scanner;

public class Series_Menu {
    public static void main(String[] args) {
        int ch, n, i, a;
        float x, y, Sum=0.0f;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Choice: \n1.Print Series \n2.Sum Series");
        ch = sc.nextInt();

        switch (ch) {
            case 1 -> {  //print series
                System.out.println("Enter n: ");
                n = sc.nextInt();
                for (i = 1; i <= n; i++) {
                    a = i * i - 1;
                    System.out.print(a + ", ");
                }
            }
            case 2 -> {  //sum series
                for (x = 1; x < 20; x++) {
                    for (y = 2; y <= 20; y++) {
                        Sum += x / y;
                    }
                }
                System.out.format("%.2f", Sum);
            }
            default -> System.out.println("Invalid! Choice");
        }
    }
}
