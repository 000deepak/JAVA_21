import java.util.Scanner;

public class LineComparison_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter line co-ordinates in formant x1,y1  format");

        double[] p = new double[8]; //array to store co ordinates
        int i;

        for (i=0 ; i<8 ; i++)
        {
            p[i] = sc.nextDouble();
            System.out.println(p[i]);

        }

        //calculate length of array
        double length_line_1 = Math.sqrt(Math.pow((p[2]-p[0]),2) + Math.pow((p[3]-p[1]),2));
        double length_line_2 = Math.sqrt(Math.pow((p[6]-p[4]),2) + Math.pow((p[7]-p[5]),2));
        System.out.println(length_line_1);
        System.out.println(length_line_2);


        //find largest line by comparison

        if (length_line_1 > length_line_2)
            System.out.println("line 1 is greater");
        else if (length_line_1 == length_line_2)
            System.out.println("lines are equal");
        else
            System.out.println("line 2 is greater");


    }

}
