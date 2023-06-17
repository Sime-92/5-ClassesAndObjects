public class Segmento {
    private Punto startPoint;
    private Punto endPoint;

    public Segmento() {
        this.startPoint = new Punto();
        this.endPoint = new Punto();
    }

    public Segmento(Punto startPoint, Punto endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public double modulo() {
        int diffX = endPoint.getX() - startPoint.getX();
        int diffY = endPoint.getY() - startPoint.getY();
        return Math.sqrt(diffX * diffX + diffY * diffY);
    }

    public void setOffset(int offX, int offY) {
        startPoint.setOffset(offX, offY);
        endPoint.setOffset(offX, offY);
    }

    public void setStartPoint(Punto startPoint) {
        this.startPoint = startPoint;
    }

    public void setEndPoint(Punto endPoint) {
        this.endPoint = endPoint;
    }

    public Punto getStartPoint() {
        return startPoint;
    }

    public Punto getEndPoint() {
        return endPoint;
    }

    public String toString() {
        return startPoint.toString() + " - " + endPoint.toString();
    }
}

