import java.util.Scanner;

public class STD_Codes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] cities = new String[3];
        String[] std = new String[3];

        System.out.println("Enter Cities: ");
        for(int i=0;i<cities.length;i++){
            cities[i]= sc.next();

        }

        System.out.println("Enter STD codes: ");
        for(int i=0;i<std.length;i++){
            std[i]= sc.next();
        }

        System.out.println("Enter Name for searching: ");
        String target = sc.next();

        for(int i=0;i<3;i++){
            if(target.equalsIgnoreCase(cities[i])){
                System.out.println(cities[i]+" : "+std[i]);
            }
        }
    }
}