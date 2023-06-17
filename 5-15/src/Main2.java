public class Main2 {
    public static void main(String[] args) {
        Punto punto1 = new Punto(4, 5);
        Punto punto2 = new Punto(6, 8);

        punto1.setOffset(4, 4);
        punto2.setOffset(4, 4);

        System.out.println("Punto 1: " + punto1.toString());
        System.out.println("Punto 2: " + punto2.toString());
    }
}
