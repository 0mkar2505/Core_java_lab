class rhombus {
    double d1, d2, side;
    double area() {
        return (d1 * d2) / 2;
    }
    double perimeter() {
        return 4 * side;
    }
}

class mymain1{
    public static void main(String args[]) {
        rhombus aRhombus;
        aRhombus = new rhombus();
        aRhombus.d1 = 10;
        aRhombus.d2 = 20;
        aRhombus.side = 12;
        double area = aRhombus.area();
        double perimeter = aRhombus.perimeter();
        System.out.println("Diagonal 1 " + aRhombus.d1 + " Area " + area);
        System.out.println("Diagonal 2 " + aRhombus.d2 + " Perimeter " + perimeter);
    }
}