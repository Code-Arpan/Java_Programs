class Circle
{
    public static void main (String args[])
    {
        double area, circumference, radius= 3.0;  // use type double for precision
        circumference = 2 * 3.14 * radius ;       // circumference = 2 * pi * radius
        area = 3.14 * radius * radius ;               // area = pi radius.
        // Output the radius, circumference, and area neatly.
        System.out.println ("The radius of the circle is:" + radius);
        System.out.println ("Its circumference is:" + circumference);
        System.out.println ("Its area is:" + area);
    }
}