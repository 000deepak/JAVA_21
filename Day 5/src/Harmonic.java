public class Harmonic {
    public static void main(String[] args) {



        double sum =0;
        int n = (int) (Math.random() * 10);
        for (double i =1; i <= n; i++) {
            sum =sum+ (1/i);
        }
        System.out.println("sum till "+" "+ n +" "+"th hormonic number is");
        System.out.println(sum);
    }
}