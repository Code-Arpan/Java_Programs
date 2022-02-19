public class Overload3
{
    double V;
    double volume(double R)
    {
        double V=4.0/3 * 22/7 * Math.pow(R, 3);
        return(V);
    }

    double volume(double H, double R)
    {
        double V=22/7 * (R*R) * H;
        return(V);
    }

    double volume(double L, double B, double H)
    {
        double V=L * B * H;
        return(+V);

    }

    public static void main(String args[]){
        Overload3 cl = new Overload3();
        double x = cl.volume(6);
        double y = cl.volume(6,9);
        double z = cl.volume(6, 9, 9);
        System.out.println("Volume of Sphere: "+x+"\nVolume of Cylinder: "+y+"\nVolume of Cuboid: "+z);

    }
}
