package Methods;

class ShapesArea {

    void area(int side) {
        double areaS = side * side;
        System.out.println("Area of Square is: " + areaS);
    }

    void area(int l, int b) {
        double areaR = l * b;
        System.out.println("Area of Rectangle is: " + areaR);
    }

    void area(int l, int b, int c) {
        double s = (l + b + c) / 2.0;
        double areaT = Math.sqrt(s * (s - l) * (s - b) * (s - c));
        System.out.println("Area of Triangle is: " + areaT);
    }

    void area(short base, short height) {
        double areaP = base * height;
        System.out.println("Area of Parallelogram is: " + areaP);
    }
}

public class ASS1 {
    public static void main(String[] args) {

        ShapesArea s = new ShapesArea();

        s.area(4);           // Square
        s.area(4, 5);        // Rectangle
        s.area(4, 3, 5);     // Triangle
        s.area((short)4, (short)5); // Parallelogram
    }
}