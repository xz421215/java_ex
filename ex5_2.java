/**
*    2.給予三角形三邊長(int)a,b,c,請判斷是直角,銳角,鈍角,或非三角形.
*	(註:假設邊長排序結果,a <= b <= c,則
*		直角(right triangle): c*c = a*a + b*b
*		鈍角(obtuse triangle): c*c > a*a + b*b
*		銳角(sharp triangle): c*c < a*a + b*b
*       非三角形(non triangle): a + b <= c)
*/
import java.util.*;
public class ex5_2{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int a,b,c;
        System.out.print("a=");
        a = scanner.nextInt();
        System.out.print("b=");
        b = scanner.nextInt();
        System.out.print("c=");
        c = scanner.nextInt();
        boolean rightTriangle=c*c==a*a+b*b;
        boolean obtuseTriangle=c*c>a*a+b*b;
        boolean sharpTriangle=c*c<a*a+b*b;
        boolean nonTriangle=a+b<=c;

        if (rightTriangle) {
            System.out.println("直角");
        } else if(obtuseTriangle) {
            System.out.println("鈍角");
        } else if(sharpTriangle) {
            System.out.println("銳角");
        } else if(nonTriangle) {
            System.out.println("非三角形");
        }
        scanner.close();
    }
}
