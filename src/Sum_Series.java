import java.util.Scanner;

public class Sum_Series {
    public static void main(String[] args) {
        int ch, i, n, f=1;
        double S=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        n = sc.nextInt();
        System.out.println("Enter Choice:\n 1.S=1/4+1/8+1/12.........upto n terms\n 2.S=1/1!-2/2!+3/3!.......upto n terms");
        ch = sc.nextInt();

        switch (ch){
            case 1:
                for(i=4;i<=n;i+=4){
                    S+=1.0/i;
                }
                System.out.println("Sum = "+S);
                break;

            case 2:
                for(i=1;i<=n;i++){
                    for(int j=1;j<=i;j++){
                        f*=j;
                    }
                    if(i%2==0){
                        S-=1.0/f;
                    }
                    else{
                        S+=1.0/f;
                    }
                }
                System.out.println("Sum = "+S);
                break;

            default:
                System.out.println("Invalid!");
        }
    }
}
