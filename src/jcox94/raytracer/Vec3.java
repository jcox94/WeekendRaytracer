package jcox94.raytracer;

public class Vec3 {
    public double x, y, z;

    public Vec3() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    public Vec3(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vec3 negate() {
        return new Vec3(-x, -y, -z);
    }

    public void addFrom(Vec3 other) {
        x += other.x;
        y += other.y;
        z += other.z;
    }

    public void multFrom(double t) {
        x *= t;
        y *= t;
        z *= t;
    }

    public void divFrom(double t) {
        this.multFrom(1/t);
    }

    public double length() {
        return Math.sqrt(lengthSquared());
    }

    public double lengthSquared() {
        return x * x + y * y + z * z;
    }

    @Override
    public String toString() {
        return x + " " + y + " " + z;
    }

    public static Vec3 add(Vec3 u, Vec3 v) {
        return new Vec3(u.x + v.x, u.y + v.y, u.z + v.z);
    }

    public static Vec3 sub(Vec3 u, Vec3 v) {
        return new Vec3(u.x - v.x, u.y - v.y, u.z - v.z);
    }

    public static Vec3 mult(Vec3 u, Vec3 v) {
        return new Vec3(u.x - v.x, u.y - v.y, u.z - v.z);
    }

    public static Vec3 mult(double t, Vec3 v) {
        return new Vec3(t * v.x, t * v.y, t * v.z);
    }

    public static Vec3 mult(Vec3 v, double t) {
        return Vec3.mult(t, v);
    }

    public static Vec3 div(Vec3 v, double t) {
        return Vec3.mult(1 / t, v);
    }

    public static double dot(Vec3 u, Vec3 v) {
        return u.x * v.x + u.y * v.y + u.z * v.z;
    }

    public static Vec3 cross(Vec3 u, Vec3 v) {
        return new Vec3
                        (u.y * v.z - u.z * v.y,
                        u.z * v.x - u.x * v.z,
                        u.x * v.y - u.y * v.x);
    }

    public static Vec3 unitVector(Vec3 v) {
        return Vec3.div(v, v.length());
    }
}
