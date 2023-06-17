
    public class Punto {
        private int x;
        private int y;

        public Punto() {
            this.x = 0;
            this.y = 0;
        }

        public Punto(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public String toString() {
            return "(" + x + ", " + y + ")";
        }

        public void moveTo(int newX, int newY) {
            this.x = newX;
            this.y = newY;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        public void setOffset(int offX, int offY) {
            this.x += offX;
            this.y += offY;
        }
    }


