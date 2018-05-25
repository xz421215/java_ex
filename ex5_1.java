/**
*    1.給予 int x,請計算 y 值,其公式如下:
*	y = 3 * x^2		若 x < -1
*	y = x^3 + 3 * x - 3	若 -1 <= x <= 1
*	y = 2 * x + 3		若 x > 1
*/
import java.util.*;
public class ex5_1{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int x,y;
        System.out.print("x=");
        x = scanner.nextInt();
        scanner.close();
        if(x <= 1&& x >= -1){
            y=x*x*x+3*x;
        } else if (x > 1) {
            y=2*x+3;
        } else {
            y=3*x*x;
        }
        System.out.println("y="+y);
    }

}
