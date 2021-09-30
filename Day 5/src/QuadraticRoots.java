public class QuadraticRoots {
    static double a = (Math.random() * 10),
            b = (Math.random() * 10),
            c = (Math.random() * 10),
            d = Math.sqrt(b * b - 4 * a * c);

    public static void main(String[] args) {
        double[] roots = roots(a, b, c, d);
        System.out.println("roots are" + " " + roots[0] + " " + "and" + " " + roots[1]);
    }

    static double[] roots(double a, double b, double c, double d) {
        double[] roots = new double[2];
        roots[0] = -b + d / 2 * a;
        roots[1] = -b - d / 2 * a;
        return roots;
    }

}
