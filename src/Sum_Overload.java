class Sum_Overload{
    static void SumSeries(int n, double x){
        int i;
        double s=0.0;
        for(i=1;i<=n;i++){
            s+= x/i;
        }
        System.out.println("Sum of the 1st Series: "+s);
    }

    static void SumSeries(){
        int i, j, s=0, m=1;
        for(i=1;i<=20;i++){
            for(j=1;j<=i;j++){
                m*=j;
            }
            s+=m;
        }
        System.out.println("Sum of the 2nd Series: "+s);
    }

    public static void main(String[] args){
        SumSeries(10, 52.25);
        SumSeries();
    }
}