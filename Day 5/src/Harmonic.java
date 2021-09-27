public class Harmonic {
    public static void main(String[] args) {



        double sum =0;
        int n = (int) (Math.random() * 10);
        for (double i =1; i <= n; i++) {
            sum =sum+ (1/i);
        }
        System.out.println(n);
        System.out.println(sum);
    }
}