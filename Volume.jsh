public class Volume {
    public static double sphere(double d) {
        double r = d / 2;
        double v = (4.0 / 3.0) * Math.PI * Math.pow(r, 3);
        System.out.println("Volume =" + v);
        return v;
    }

    public static void main(String[] args) {
        sphere( 20.24);
    }
}
