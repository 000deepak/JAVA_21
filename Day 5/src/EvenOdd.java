public class EvenOdd {
    public static void main(String[] args) {
        double n = Math.floor((Math.random() * 10) % 10);
        if ((n % 2) == 0)
            System.out.println("even number");
        else
            System.out.println("odd number");

    }
}