public class Main3 {
    public static void main(String[] args) {
        Punto startPoint = new Punto(4, 5);
        Punto endPoint = new Punto(6, 8);

        Segmento segmento = new Segmento(startPoint, endPoint);

        segmento.setOffset(4, 4);

        System.out.println(segmento.toString());
        System.out.println("Módulo: " + segmento.modulo());
    }
}

