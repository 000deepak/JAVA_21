public class QuoRemainder {

    static int a = (int) (Math.random() * 10);
    static int b = (int) (Math.random() * 10);

    public static void main(String[] args) {
        System.out.println("first no "+ a);
        System.out.println("second no"+ b);
        System.out.println(QuoRemainder.Quotient(a,b));
        System.out.println(QuoRemainder.Remainder(a,b));
    }

    public static double Quotient(int a,int b){
        return a/b ;}
    public static double Remainder(int a,int b){
        return a%b ;}

}
