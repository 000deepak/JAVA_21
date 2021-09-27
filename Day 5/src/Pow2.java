public class Pow2 {
    public static void main(String[] args) {

        double sum = 0;
        int n = (int) (Math.random() * 10);
        System.out.println(n);
        for (double i = 0; i <= n; i++) {
            sum =  Math.pow(i,2);
            System.out.println(sum);

        }

    }
}