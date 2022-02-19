public class Overload
{
    void series(int x, int n){
        double sum=0;
        for(int i=1;i<=n;i++){
            sum+= Math.pow(x,i);
        }
        System.out.println("Sum of Series:"+sum);
    }

    void series(int p){
        for(int i=1;i<=p;i++){
            System.out.print((i*i*i)-1+",");
        }
    }

    void series(){
        double sum=0;
        for(int i=2;i<=10;i++){
            sum+= 1.0/i;
        }
        System.out.println("Sum of Series:"+sum);
    }

    public static void main(String args[]){
        Overload cl = new Overload();
        cl.series(2,10);
        cl.series(10);
        System.out.println(" ");
        cl.series();

    }
}
