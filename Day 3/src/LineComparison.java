//line assign using two co ordinates
// deepak kumbhar  23/9/21

import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args){

        //taking input points
        Scanner sc =new Scanner(System.in);
        System.out.println("enter line co-ordinates in formant x1,y1 & x2,y2  for two points");
        double ax1 = sc.nextDouble();
        double ay1 = sc.nextDouble();
        double ax2 = sc.nextDouble();
        double ay2 = sc.nextDouble();

        double bx1 = sc.nextDouble();
        double by1 = sc.nextDouble();
        double bx2 = sc.nextDouble();
        double by2 = sc.nextDouble();

        //calculating length of line
        double length_line_1 = Math.sqrt(Math.pow((ax2-ax1),2) + Math.pow((ay2-ay1),2));
        double length_line_2 = Math.sqrt(Math.pow((bx2-bx1),2) + Math.pow((by2-by1),2));
        System.out.println(length_line_1);
        System.out.println(length_line_2);


        //finding largest line
        if (length_line_1 > length_line_2)
            System.out.println("line 1 is greater");
        else if (length_line_1 == length_line_2)
            System.out.println("lines are equal");
        else
            System.out.println("line 2 is greater");

    }
}
