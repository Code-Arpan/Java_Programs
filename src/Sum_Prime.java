import java.util.Scanner;

public class Sum_Prime {
    static boolean checkPrime(int num)
    {
        if(num == 1) {
            return false;
        }
        for (int i = 2; i*i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args)
    {
        int sum = 0, i, s, e;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Range: ");
        s = sc.nextInt();
        e = sc.nextInt();

        for (i = e; i >= s; i--) {
            if (checkPrime(i)) {
                sum+=i;
            }
        }
        System.out.println("The sum of all the prime numbers between "+s+"-"+e+" is "+sum);
    }
}