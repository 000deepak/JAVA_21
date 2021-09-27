public class FlipCoin {
    public static void main(String[] args) {
        double times_to_flip = Math.floor((Math.random() * 10) % 10);
        System.out.println("coin fliped " + times_to_flip + "times");
        double i = 0;
        int h = 0;
        int t = 0;
        double m = 0;

       
        for  (i=0 ; i < times_to_flip ; i++){
            m = Math.random();
            System.out.println(m);
            if(m < 0.5) {
              h += 1;}
            else {
              t += 1;}
        }
        System.out.println("head %"  + ((h / times_to_flip) * 100)  );
        System.out.println("tail %"  + ((t / times_to_flip) * 100)  );

    }

}