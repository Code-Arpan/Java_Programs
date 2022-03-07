public class Compare_Overload {
    public static void compare(int n, int m) {
        System.out.println( Math.max(n , m));
    }
    public static void compare(char a, char b) {
        System.out.println(a > b? a : b);
    }
    public static void compare(String a, String b) {
        System.out.println( a.length() > b.length()? a : b);
    }

    public static void main(String[] args) {
        compare(56, 65);
        compare('H', 'I');
        compare("Thank", "you");
    }
}
