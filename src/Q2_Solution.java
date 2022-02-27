/*
   Bi-wizard 2.0 Contest Question-2
   In Geeksland, only the coins with denominations {1, 2, 5, 10, 20, 50, 100, 500, 1000} are there.
   Geeks went to a shop where he have to pay N cents to the shopkeeper. You need to find the
   minimum coins that he needed pay which sum to N cents.
 */
public class Q2_Solution {
    int minimum_coins(int n){
        int ar[] = {1, 2, 5, 10, 20, 50, 100, 500, 1000};
        int cn=0, i, coins; //cn- coins needed

        for(i=8;i>=0;i--){
            coins=n/ar[i];
            cn+=coins;
            n-=coins*ar[i];
        }
        return cn;
    }

    public static void main(String[] args){
        Q2_Solution call = new Q2_Solution();
        System.out.println(call.minimum_coins(70));
    }
}
