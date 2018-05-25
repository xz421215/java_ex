/**
*3.給予三個Double a,b,c,
*	請求出其中最大(max,maximum)和最小者(min,minimum).
*/
import java.util.*;
import java.lang.*;
public class ex5_3{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        double a,b,c;
        System.out.print("a=");
        a = scanner.nextDouble();
        System.out.print("b=");
        b = scanner.nextDouble();
        System.out.print("c=");
        c = scanner.nextDouble();
        System.out.println("max:"+Math.max(a,Math.max(b,c)));  
        System.out.println("min:"+Math.min(a,Math.min(b,c)));
    }
}
