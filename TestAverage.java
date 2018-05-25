/*
請建立一個TestAverage.java，亂數產生100個介於1~10的數字，並算出他們的平均值
*/
import java.lang.*;
public class TestAverage{
    public static void main(String[] args) {
        int[] randomNum = new int [100] ;
        double avg,sum=0;
        for(int i=0; i<100; i++) {
            randomNum[i]=(int)(Math.random()*10+1);
        }
        System.out.print("avg(");
        for(int i=0; i<100; i++) {

            System.out.print(randomNum[i]);
            sum+=randomNum[i];
            if(i<100-1)
                System.out.print("+");
        }
        avg=sum/100;
        System.out.print(")="+avg);
        /*原本
        int randomNum;
        double avg,sum=0;
        System.out.print("avg(");
        for(int i=1; i<=100; i++) {
            randomNum=(int)(Math.random()*10+1);
            sum+=randomNum;
            System.out.print(randomNum);
            if(i<100)
                System.out.print("+");
        }
        avg=sum/100;
        System.out.print(")="+avg);
        */
    }
}