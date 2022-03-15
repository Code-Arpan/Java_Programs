import java.util.Scanner;

public class Bank_Deposit {
    public static void main(String[] args) {
        double P, r, n, A = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Choice: \n 1.Term Deposit \n 2.Recurring Deposit");
        int ch = sc.nextInt();
        
        switch (ch){
            case 1: //Term Deposit
                System.out.print("Enter Principal: ");
                P = sc.nextDouble();
                System.out.print("Enter Rate of Interest: ");
                r = sc.nextDouble();
                System.out.print("Enter time period in years: ");
                n = sc.nextDouble();
                A = P * Math.pow(1+r/100, n);
                break;

            case 2: //Recurring Deposit
                System.out.print("Enter Monthly Installment: ");
                P = sc.nextDouble();
                System.out.print("Enter Rate of Interest: ");
                r = sc.nextDouble();
                System.out.print("Enter time period in months: ");
                n = sc.nextDouble();
                A = (P * r * n*(n+1) / 2400) + (P*n);
                break;

            default:
                System.out.println("Invalid!");
        }
        System.out.println("\nMaturity Amount: "+A);
    }
}
