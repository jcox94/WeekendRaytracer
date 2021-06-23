package jcox94.raytracer;

public class Color extends Vec3 {
    public Color() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    public Color(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void write() {
        int ir = (int)(255.999 * x);
        int ig = (int)(255.999 * y);
        int ib = (int)(255.999 * z);
        System.out.println(ir + " " + ig + " " + ib);
    }
}
