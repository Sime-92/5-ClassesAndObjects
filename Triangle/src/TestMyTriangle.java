public class TestMyTriangle {
    public static void main(String[] args) {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(3, 0);
        Point p3 = new Point(0, 4);

        Triangle triangle1 = new Triangle(p1, p2, p3);
        System.out.println(triangle1);
        System.out.println("Perimeter: " + triangle1.getPerimeter());
        System.out.print("Type: ");
        triangle1.printType();
    }
}
