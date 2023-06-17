public class Main {
    public static void main(String[] args) {
        Punto punto = new Punto();
        System.out.println("Punto inicial: " + punto.toString());

        punto.moveTo(3, 7);
        System.out.println("Punto después de moverlo: " + punto.toString());

        punto.setOffset(2, -4);
        System.out.println("Punto después de aplicar offset: " + punto.toString());
    }
}


