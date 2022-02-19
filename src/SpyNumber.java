import java.util.Scanner;
public class SpyNumber {
    public static void main(String args[]){
        int n, s=0, p=1, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        n = sc.nextInt();

        for(i=10;n>0;n/=10){
            s+=n%i;
            p*=n%i;
        }

        if(s==p){
            System.out.println("Spy Number");
        }
        else{
            System.out.println("Not a Spy Number");
        }
    }
}
