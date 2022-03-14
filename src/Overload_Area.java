public class Overload_Area {
    static double area(double a, double b, double c){
        double s = (a+b+c)/2;
        double ar = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return(ar);
    }

    static double area(int a, int b, int height){
        double ar = 0.5*height*(a+b);
        return(ar);
    }

    static double area(double diagonal1, double diagonal2){
        double ar = 0.5 * diagonal1 * diagonal2;
        return(ar);
    }

    public static void main(String[] args) {
        System.out.println(area(3.5, 3.5, 4.5));
        System.out.println(area(4, 6, 8));
        System.out.println(area(4.5, 9.0));
    }
}
