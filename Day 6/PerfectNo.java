public class Perfect {
    public static void main(String[] args) {
        int n = (int) (Math.random() * 100);
        int sum = 0;
        for (int i = 1; i <= n; i++) {

            if (n % i == 0)
                sum += sum + i;
            else
                continue;
        }
        if(sum==n)
            System.out.println("perfect");
        else
            System.out.println("not perfect"+n);

    }
}
