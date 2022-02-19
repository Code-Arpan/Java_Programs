import java.util.*;
class StudentsMarks
{
    public static void main(String args[]){
        double der, average, avg=0.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("No. of Students:");
        int n = sc.nextInt();
        String name[]=new String[n];
        int totalmarks[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter name & marks:");
            name[i]=sc.nextLine();
            totalmarks[i]=sc.nextInt();
            avg+=totalmarks[i];
        }
        average = avg/n;
        System.out.println("Average of Total Marks: "+average);

        for(int i=0;i<n;i++){
            der = totalmarks[i] - average;
            System.out.println("Derivation of "+name[i]+" is "+der);
        }
    }
}