import java.util.Scanner;
/*
  A number is called a tech number if the given number has an even number of digits and the number can be divided
  exactly into two parts from the middle. After equally dividing the number, if the square of sum of the numbers is
  equals to the number itself, the given number is a tech number, else, not a tech number. For example, 2025 is a tech number.
 */
public class TechNumber {
    public static void main(String[] args){
        int num, a, b, s;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number: ");
        num = sc.nextInt();
        if(num>=1000 && num<=9999){
            a=num%100;
            b=num/100;
            s = a + b;
            if(s*s == num){
                System.out.println(num+" is a Tech Number.");
            }
            else{
                System.out.println(num+" is not a Tech Number.");
            }
        }
    }
}
