import java.util.Scanner;

public class Atransport {
        String name;
        int w, charge;

        void accept(){
            Scanner sc = new Scanner(System.in);
            name = sc.nextLine();
            w = sc.nextInt();
        }

        void calculate(){
            if(w<=10){
                charge = 25 * w;
            }
            else if(w>10 && w<=30){
                charge = 250 + (w-10)*20;
            }
            else{
                charge = 250+400 + (w-30)*10;
            }
            charge = charge/5 * 100;
        }

        void print(){
            System.out.println("Name : " +name);
            System.out.println("Weight : "+w);
            System.out.println("Bill amount : "+charge);
        }

    public static void main(String[] args) {
        Atransport call = new Atransport();
        call.accept();
        call.calculate();
        call.print();
    }
}




