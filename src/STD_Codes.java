import java.util.Scanner;

public class STD_Codes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many cities you want to enter? ");
        int n = sc.nextInt();

        String[] cities = new String[n];
        String[] std = new String[n];

        System.out.println("Enter "+n+" Cities: ");
        for(int i=0;i<cities.length;i++){
            cities[i]= sc.next();

        }

        System.out.println("Enter "+n+" STD codes: ");
        for(int i=0;i<std.length;i++){
            std[i]= sc.next();
        }

        System.out.println("Enter Name for searching: ");
        String target = sc.next();

        for(int i=0;i<cities.length;i++){
            if(target.equalsIgnoreCase(cities[i])){
                System.out.println(cities[i]+" : "+std[i]);
            }
        }
    }
}