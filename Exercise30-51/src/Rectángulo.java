public class Rectángulo extends Punto {
    private int width;
    private int height;

    public Rectángulo() {
        super();
        this.width = 0;
        this.height = 0;
    }

    public Rectángulo(Punto p, int newWidth, int newHeight) {
        super(p.getX(), p.getY());
        this.width = newWidth;
        this.height = newHeight;
    }

    public Rectángulo(Punto p1, Punto p2) {
        super(p1.getX(), p1.getY());
        this.width = p2.getX() - p1.getX();
        this.height = p2.getY() - p1.getY();
    }

    public double getArea() {
        return width * height;
    }

    public Punto getTopLeftPoint() {
        return this;
    }

    public Punto getTopRightPoint() {
        return new Punto(getX() + width, getY());
    }

    public Punto getBottomLeftPoint() {
        return new Punto(getX(), getY() + height);
    }

    public Punto getBottomRightPoint() {
        return new Punto(getX() + width, getY() + height);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "(" + getX() + ", " + getY() + ") width: " + width + " height: " + height;
    }
}
