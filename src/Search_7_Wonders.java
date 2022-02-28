import java.util.Scanner;

public class Search_7_Wonders {
    public static void main(String[] args){
        String w[] = {"CHICHEN ITZA", "CHRIST THE REDEEMER", "TAJMAHAL", "GREAT WALL OF CHINA",
                "MACHU PICCHU", "PETRA", "COLOSSEUM"};
        String c[] = {"MEXICO", "BRAZIL", "INDIA", "CHINA", "PERU", "JORDAN", "ITALY"};
        String s;
        int i, flag = 0, index = 0;
            Scanner br = new Scanner(System.in);
            System.out.println("Enter name to be searched: ");
            s = br.nextLine();
            for(i = 0; i < 7; i++) {
                if (s.equalsIgnoreCase(c[i])) {
                    flag = 1;
                    index = i;
                    break;
                }
            }
            if(flag == 1){
              System.out.println(c[index] + " – " + w[index]);
            }
            else {
              System.out.println("Sorry Not Found!");
            }
    }
}