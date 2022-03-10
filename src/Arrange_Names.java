import java.util.*;

public class Arrange_Names {
    public static void main(String[] args) {
        int i, j; String temp;
        Scanner sc = new Scanner(System.in);
        String[] names = new String[10];
        System.out.println("Enter First Names: ");

        //inputing the first names and converting them into upper case
        for (i=0;i<names.length;i++){
           names[i] = sc.next();
           names[i] = names[i].toUpperCase();
        }

        //sorting the name list in alphabetical order
        for (i=0;i<names.length-1; i++)
        {
            for(j=i+1;j<names.length;j++)
            {
                if (names[i].compareTo(names[j]) > 0)
                {
                    temp=names[i];
                    names[i]=names[j];
                    names[j]=temp;
                }
            }
        }

        //printing the sorted name list
        for (i=0;i<names.length;i++){
            System.out.println(names[i]);
        }
    }
}
