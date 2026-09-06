abstract class Shape{
    abstract void surfaceArea();
    abstract void volume();
}
class Sphere extends Shape{
    double r;
    Sphere(double r)
    {
        this.r = r;
    }
    void surfaceArea()
    {
        double sa = 4 * 3.14 * r * r;
        System.out.println("Surface Area of Sphere = " + sa);
    }
    void volume()
    {
        double v = (4.0 / 3.0) * 3.14 * r * r * r;
        System.out.println("Volume of Sphere = " + v);
    }
}
class Cube extends Shape{
    double side;
    Cube(double side)
    {
        this.side = side;
    }
    void surfaceArea()
    {
        double sa = 6 * side * side;
        System.out.println("Surface Area of Cube = " + sa);
    }
    void volume()
    {
        double v = side * side * side;
        System.out.println("Volume of Cube = " + v);
    }
}
class RectangularPrism extends Shape{
    double length, breadth, height;

    RectangularPrism(double length, double breadth, double height)
    {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    void surfaceArea()
    {
        double sa = 2 * (length * breadth + breadth * height + length * height);
        System.out.println("Surface Area of Rectangular Prism = " + sa);
    }
    void volume()
    {
        double v = length * breadth * height;
        System.out.println("Volume of Rectangular Prism = " + v);
    }
}
class Cylinder extends Shape{
    double r, h;
    Cylinder(double r, double h)
    {
        this.r = r;
        this.h = h;
    }
    void surfaceArea()
    {
        double sa = 2 * 3.14 * r * (r + h);
        System.out.println("Surface Area of Cylinder = " + sa);
    }
    void volume()
    {
        double v = 3.14 * r * r * h;
        System.out.println("Volume of Cylinder = " + v);
    }
}
class Demo1{
    public static void main(String args[])
    {
        Sphere s = new Sphere(5);
        Cube c = new Cube(4);
        RectangularPrism rp = new RectangularPrism(5, 4, 3);
        Cylinder cy = new Cylinder(3, 7);
        s.surfaceArea();
        s.volume();
        c.surfaceArea();
        c.volume();
        rp.surfaceArea();
        rp.volume();
        cy.surfaceArea();
        cy.volume();
    }
}