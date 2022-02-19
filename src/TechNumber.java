import java.util.Scanner;

public class TechNumber {
    public static void main(String args[]){
        int num, a, b, s;
        Scanner sc=new Scanner(System.in);
        num = sc.nextInt();
        if(num>=1000 && num<=9999){
            a=num%100;
            b=num/100;
            s = a + b;
            if(s*s == num){
                System.out.println(num+" is a Tech Number");
            }
        }
    }
}
