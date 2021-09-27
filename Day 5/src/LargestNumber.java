public class LargestNumber {
    public static void main(String[] args) {


        int a = (int) (Math.random() * 10);
        System.out.println(a);
        int b = (int) (Math.random() * 10);
        System.out.println(b);
        int c = (int) (Math.random() * 10);
        System.out.println(c);

        if (a > b){
            if (a > c)
                System.out.println(a);}
        else if (b > c)
            System.out.println(b);
        else
            System.out.println(c);


    }
}
