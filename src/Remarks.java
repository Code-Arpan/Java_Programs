import java.util.Scanner;

public class Remarks {
    static String remarks(double avg, int n){
        String rmk="";
        for(int i = 0; i <n ; i++)
        {
            if(avg >= 85 && avg <= 100)
            {
                rmk = "EXCELLENT";
            }
            else if(avg >= 75 && avg <= 84)
            {
                rmk = "DISTINCTION";
            }
            else if(avg >= 60 && avg <= 74)
            {
                rmk = "FIRST CLASS";
            }
            else if(avg >= 40 && avg <= 59)
            {
                rmk = "PASS";
            }
            else
            {
                rmk = "POOR";
            }
        }
        return rmk;
    }

    public static void main(String[] args) {
        int i,n, no;
        int[] rno;
        String[] name;
        double avg;
        double[] m1;
        double[] m2;
        double[] m3;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Students: ");
        n = sc.nextInt();

        rno = new int[n];
        name = new String[n];
        m1 = new double[n];
        m2 = new  double[n];
        m3 = new double[n];

        for(i=0;i<n;i++){
            no = i+1;
            System.out.println("Enter Details of the "+no+" Student: ");
            rno[i] = sc.nextInt();
            name[i] = sc.next();
            m1[i] = sc.nextDouble();
            m2[i] = sc.nextDouble();
            m3[i] = sc.nextDouble();


        }
        for(i=0;i<n;i++){
            avg = (m1[i] + m2[i] + m3[i]) / 3.0;
            System.out.println(rno[i] + " " + name[i]+ " " +remarks(avg,n));
        }
    }
}

