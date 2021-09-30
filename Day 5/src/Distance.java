public class Distance {

    static double x = Math.floor((Math.random() * 10) % 10);
    static double y = Math.floor((Math.random() * 10) % 10);

    public static void main(String[] args) {

        System.out.println("distance from origin is"+" "+Distance.distance(x,y));
    }

    public static double distance(double x, double y) {
        double length = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        return length;
    }
}
