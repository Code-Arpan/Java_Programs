import java.util.Scanner;
public class ElectricBill {
    String n;
    int units;
    double bill;
    void accept(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name:");
        n=sc.nextLine();
        System.out.println("Enter units consumed:");
        units= sc.nextInt();
    }

    void calculate() {
        if (units <= 100) {
            bill = 2 * units;
        } else if (units > 100 && units <= 300) {
            bill = 200 + (units - 100) * 3;
        } else {
            bill = 200 + 600 + (units - 300) * 5;
            bill += 2.5 / 100 * bill;
        }
    }

    void print()
    {
        System.out.println("Name of the customer😎:"+n);
        System.out.println("Number of Units consumed😮:"+units);
        System.out.println("Bill Amount🤑:"+bill);
    }

    public static void main(String args[])
    {
        ElectricBill cl = new ElectricBill();
        cl.accept();
        cl.calculate();
        cl.print();
    }
}


