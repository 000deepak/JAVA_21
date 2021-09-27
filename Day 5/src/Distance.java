public class Distance {
    public static  void  main(String[]args){
        double x = Math.floor((Math.random() * 10) % 10);
        double y = Math.floor((Math.random() * 10) % 10);
        double length = Math.sqrt(Math.pow((x-0),2) + Math.pow((y-0),2));
        System.out.println(length);
    }
}
