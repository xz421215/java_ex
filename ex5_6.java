/*
6.輸入一個整數N,列舉如下數列,直到數字超過N為止.
	(a) 1,3,5,7,9,11,13,.....
	(b) 1,2,4,7,11,16,22,29,.....
	(c) 1,2,2,3,3,3,4,4,4,4,5,5,5,5,5,.....
*/
import java.util.Scanner;
public class ex5_6{
    public static void main(String args[]){
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("n=");
        n = scanner.nextInt();
        System.out.print("(a) ");
        for(int i=1;i<=n;i+=2){
            System.out.print(i+",");
        }
        System.out.println("");
        System.out.print("(b) ");
        int sum=1;
        for(int x=1;x<=n;x++){
            sum+=x-1;
            System.out.print(sum+",");
        }
        System.out.println("");
        System.out.print("(c) ");
        for(int x=1;x<=n;x++){
            for(int y=1;y<=x;y++)
            System.out.print(x+",");
        }
        System.out.println("");
    }
}
