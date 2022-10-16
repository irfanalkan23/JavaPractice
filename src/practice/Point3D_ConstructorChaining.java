package practice;

/** Provides an immutable point in three dimensions */
public class Point3D_ConstructorChaining {
    public final float x, y, z;

    /**
     * Construct a Point3D located at the origin
     */
    public Point3D_ConstructorChaining() {
        this(0, 0, 0);
    }

    /**
     * Construct a Point3D located at an offset from a given point.
     */
    public Point3D_ConstructorChaining(Point3D_ConstructorChaining ref, float dx, float dy, float dz) {
        this(ref.x + dx, ref.y + dy, ref.z + dz);
    }

    /**
     * Construct a Point3D located at specified coordinates
     */
    public Point3D_ConstructorChaining(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
        // perhaps some other initialization stuff
    }
}