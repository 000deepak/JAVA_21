import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        //scanner class declaration
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the limit : ");
        int lim = sc.nextInt();
        if (lim > 0) {
            int y = 0, z = 1, s;
            System.out.print("Fibonacci Series : " + y + "  " + z + "  ");

            while (z <= lim) {
                s = y + z;
                y = z;
                z = s;
                if (z <= lim)
                    System.out.print(z + "  ");
            }
        } else
            System.out.print("Wrong Input");
    }
}