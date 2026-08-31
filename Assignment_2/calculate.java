package Java_lab.Assignment_2;

class rhombus {
    double d1, d2, side;

    double area() {
        return (d1 * d2) / 2;
    }

    double perimeter() {
        return 4 * side;
    }
}

class circle {
    double x, y, r;

    double area() {
        return 3.14 * r * r;
    }

    double circumf() {
        return 2 * 3.14 * r;
    }
}

class mymain1 {
    public static void main(String args[]) {
        rhombus aRhombus;
        aRhombus = new rhombus();
        aRhombus.d1 = 10;
        aRhombus.d2 = 20;
        aRhombus.side = 12;
        double area = aRhombus.area();
        double perimeter = aRhombus.perimeter();
        System.out.println("Area " + area);
        System.out.println("Perimeter " + perimeter);

        circle aCircle;
        aCircle = new circle();
        aCircle.x = 10;
        aCircle.y = 20;
        aCircle.r = 5;
        double area1 = aCircle.area();
        double circumference = aCircle.circumf();
        System.out.println("Area of circle: " + area1);
        System.out.println("Circumference: " + circumference);
    }
}