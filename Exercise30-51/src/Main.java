public class Main{
    public static void main(String[] args) {
        Rectángulo rectángulo = new Rectángulo();
        System.out.println(rectángulo.toString());

        rectángulo.setOffset(4, 7);
        System.out.println(rectángulo.toString());

        Rectángulo rectángulo2 = new Rectángulo(new Punto(1, 1), 8, 6);
        System.out.println(rectángulo2.toString());

        Rectángulo rectángulo3 = new Rectángulo(new Punto(2, 2), new Punto(5, 8));
        System.out.println(rectángulo3.toString());

        System.out.println("Arriba-Izquierda: " + rectángulo3.getTopLeftPoint().toString());
        System.out.println("Arriba-Derecha: " + rectángulo3.getTopRightPoint().toString());
        System.out.println("Abajo-Izquierda: " + rectángulo3.getBottomLeftPoint().toString());
        System.out.println("Abajo-Derecha: " + rectángulo3.getBottomRightPoint().toString());

        Rectángulo rectángulo4 = new Rectángulo(new Punto(5, 6), 10, 8);
        System.out.println(rectángulo4.toString());

        System.out.println("Arriba-Izquierda: " + rectángulo4.getTopLeftPoint().toString());
        System.out.println("Arriba-Derecha: " + rectángulo4.getTopRightPoint().toString());
        System.out.println("Abajo-Izquierda: " + rectángulo4.getBottomLeftPoint().toString());
        System.out.println("Abajo-Derecha: " + rectángulo4.getBottomRightPoint().toString());
    }
}
