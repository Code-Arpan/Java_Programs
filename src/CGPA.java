import java.util.Scanner;

public class CGPA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double max_marks, ob_marks, ob_percentage, cgpa;
        System.out.println("Get CGPA: \n 1.By Percentage \n 2.By Marks");
        int ch = sc.nextInt();

        switch (ch) {
            case 1 -> {  //by percentage
                System.out.println("Enter Obtained Percentage: ");
                ob_percentage = sc.nextDouble();
                cgpa = ob_percentage / 9.5;    //calculating CGPA
                System.out.print("CGPA Obtained by you is ");
                System.out.format("%.1f", cgpa);   //printing CGPA rounded upto 1 decimal
            }
            case 2 -> {  //by marks
                System.out.println("Enter Maximum Marks & Total Marks Obtained: ");
                max_marks = sc.nextDouble();
                ob_marks = sc.nextDouble();
                ob_percentage = ob_marks / max_marks * 100;   //calculating percentage
                cgpa = ob_percentage / 9.5;                 //calculating CGPA
                System.out.print("CGPA Obtained by you is ");
                System.out.format("%.1f", cgpa);    //printing CGPA rounded upto 1 decimal
            }
            default -> System.out.println("Invalid Choice");
        }
    }
}
