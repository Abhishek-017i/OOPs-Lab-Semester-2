package FigPackage;

public class Cylinder extends Figure {
    public Cylinder(double r, double h) {
        this.r = r;
        this.h = h;
    }

    public void calcArea(){this.a = 2 * pi * r *(r+h) ;}
    public void calcVolume(){this.v = pi * r * r * h;}
    public void dispArea(){System.out.println("Cylinder Area:" + String.format("%.3f", a));}
    public void dispVolume(){System.out.println("Cylinder Volume:" + String.format("%.3f", v));}
}
