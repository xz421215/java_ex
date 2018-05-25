import java.util.Scanner;

/*
4.若計程車車資,其里程在1650公尺以下皆70元,
	每超過350公尺加5元,不足350公尺以350公尺計算.
  給予里程(mileage),算出車資(fee).
*/
public class ex5_4{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int mil;
        int x=0,fee=70;
        System.out.print("里程:");
        mil = scanner.nextInt();
        mil-=1650;
        if(mil>0) {
            x=mil/350;
            fee+=5*x;
            if(mil%350>0)
                fee+=5;
        }
        System.out.print("車資:"+fee);

    }
}
