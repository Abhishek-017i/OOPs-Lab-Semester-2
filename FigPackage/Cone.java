package FigPackage;

public class Cone extends Figure{
    public Cone(double r, double h, double s) {
        this.r = r;
        this.h = h;
        this.s = s;
    }

    public void calcArea(){this.a = pi * r *(r+s) ;}
    public void calcVolume(){this.v = (pi * r * r * h) / 3.0;}
    public void dispArea(){System.out.println("Cone Area:" + String.format("%.3f", a));}
    public void dispVolume(){System.out.println("Cone Volume:" + String.format("%.3f", v));}
}
