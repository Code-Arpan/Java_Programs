import java.util.Scanner;

public class BookFair {
    String Bname;   //Book Name
    double price;
    BookFair(){
        String Bname="";
        double price=0.0;
    }

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Book Name: ");
        Bname = sc.nextLine();
        System.out.println("Enter Book Price: ");
        price = sc.nextDouble();
    }

    void calculate(){
        if(price<=1000){
            price-= price/100 * 2;
        }
        else if(price>1000 && price<=3000){
            price-= price/100 * 10;
        }
        else{
            price-= price/100 * 15;
        }
    }

    void display(){
        System.out.println("Name of the Book: "+Bname);
        System.out.println("Discounted Price: "+price);
    }

    public static void main(String[] args){
        BookFair call = new BookFair();
        call.input();
        call.calculate();
        call.display();
    }
}
