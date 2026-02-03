package FigPackage;

public class Sphere2 extends Figure {
    public Sphere2(double r) {
            this.r = r;
        }
        public void calcArea() {
            this.a = 4 * pi * r * r;
        }
        public void calcVolume() {
            this.v = (4.0 * pi * r * r * r) / 3.0;
        }
        public void dispArea() {
            System.out.println("Sphere Area: " + String.format("%.3f", a));
        }
        public void dispVolume() {
            System.out.println("Sphere Volume: " + String.format("%.3f", v));
        }
    }
