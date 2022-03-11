import java.util.Scanner;

public class taximeter {
    int taxino, km, bill;
    String name;


    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Taxi Number: ");
        taxino = sc.nextInt();
        System.out.println("Enter Name: ");
        name = sc.next();
        System.out.println("Enter Distance Travelled: ");
        km= sc.nextInt();
    }

    void  calculate(){
        if(km<=1){
            bill = 25;
        }
        else if(km>1 && km<=6){
            bill = 10*km;
        }
        else if(km>6 && km<=12){
            bill = 15*km;
        }
        else if(km>12 && km<=18){
            bill = 20*km;
        }
        else if(km>18){
            bill = 25*km;
        }
    }

    void display(){
        System.out.format("%14s %15s %15s %16s\n", "Taxino", "Name", "Km travelled", "Bill amount");
        System.out.format("%13s %16s %13s %14s\n", taxino, name, km, bill);
    }

    public static void main(String[] args) {
        taximeter cl = new taximeter();
        cl.input();
        cl.calculate();
        cl.display();
    }
}
