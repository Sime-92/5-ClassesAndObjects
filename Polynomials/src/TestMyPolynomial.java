public class TestMyPolynomial {
    public static void main(String[] args) {
        MyPolynomial p1 = new MyPolynomial(1.5, 2.4, 3.1, 5.0, 2.3);
        System.out.println("p1: " + p1);
        System.out.println("Degree of p1: " + p1.getDegree());
        System.out.println("Evaluate p1 for x = 2: " + p1.evaluate(2));

        MyPolynomial p2 = new MyPolynomial("poly.txt");
        System.out.println("\np2: " + p2);
        System.out.println("Degree of p2: " + p2.getDegree());
        System.out.println("Evaluate p2 for x = 2: " + p2.evaluate(2));

        MyPolynomial p3 = p1.add(p2);
        System.out.println("\np3 = p1 + p2: " + p3);

        MyPolynomial p4 = p1.multiply(p2);
        System.out.println("p4 = p1 * p2: " + p4);
    }
}


