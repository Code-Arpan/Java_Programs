public class Polygon_Overload {
    static void polygon(int n, char ch){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    static void polygon(int x, int y){
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                System.out.print("@");
            }
            System.out.println();
        }
    }

    static void polygon(){
        for(int i=0;i<3;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        polygon(2, 'O');
        polygon(2, 5);
        polygon();
    }
}
