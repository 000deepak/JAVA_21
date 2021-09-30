public class WindChill {


    public static void main(String[] args) {
        double t = (Math.random() * 50);
        double v = (Math.random() * 120);
        double d = Math.pow(v, 0.16);


        //System.out.println(windChill());
        if (windChill(t,v,d ) != 0) {
            System.out.println("windChill is" + windChill(t, v, d));
        } else {
            System.out.println("Enter correct values ");
        }
    }


    public static int windChill(double t, double v, double d) {
        if ((t < 50) && (3 < v) && (v < 120)) {
            double windchill = 35.74 + 0.6215 * t + (0.4275) * d;
            return (int) windchill;
        } else
            return 0;
    }

}