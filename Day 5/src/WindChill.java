public class WindChill {
    public static void main(String[] args) {
        double t = (Math.random() * 50);
        double v = (Math.random() * 120);
        double d = Math.pow(v, 0.16);

        if ((t < 50) && (3 < v) && (v < 120)) {
            double windchill = 35.74 + 0.6215 * t + (0.4275) * d;
            System.out.println(windchill);
        } else
            System.out.println("enter t>50 and  3<v<120");
    }
}