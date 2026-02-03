package FigPackage;

public class Demo {
    public static void main(String []args){
        Sphere2 s1 = new Sphere2(3);
            s1.calcArea();
            s1.calcVolume();
            s1.dispArea();
            s1.dispVolume();
            System.out.println("");

        Cone c1 = new Cone(3,4,5);
            c1.calcArea();
            c1.calcVolume();
            c1.dispArea();
            c1.dispVolume();
            System.out.println("");

        Cylinder cy1 = new Cylinder(3,7);
            cy1.calcArea();
            cy1.calcVolume();
            cy1.dispArea();
            cy1.dispVolume();
            System.out.println("");
    }
}
