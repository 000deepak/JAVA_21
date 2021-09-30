public class WindChillCalculation {
    static double t = (Math.random() * 50);
    static double v = (Math.random() * 120);
    static double d = Math.pow(v, 0.16);


    public static void main(String[] args) {

        WindChillCalculation windchill = new WindChillCalculation();
        System.out.println(windchill.windChillValue(t, v, d));
    }

    public static int windChillValue(double t, double v, double d) {
        if ((t < 50) && (3 < v) && (v < 120)) {
            double windchill = 35.74 + 0.6215 * t + (0.4275) * d;
            return (int) windchill;
        } else
            return 0;
    }

}