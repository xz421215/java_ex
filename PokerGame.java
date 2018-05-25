/*
建立一個PokerGame.java類別，發給自己和對方各一張牌，並且比較兩張牌的值，列出誰贏誰輸
*/
import java.lang.*;
import java.util.Scanner;
public class PokerGame{
    public static void main(String[] args) {
        String[][] poke;
        poke = new String[4][13];//[0][]=梅花,[1][]=方塊,[2][]=愛心,[3][]=黑桃
        int x1,y1,x2,y2;
        for(int i=0; i<=3; i++) {
            for(int j=0; j<=12; j++){
                if(i==0)
                    poke[i][j]="梅花";
                else if(i==1)
                    poke[i][j]="方塊";
                else if(i==2)
                    poke[i][j]="愛心";
                else
                    poke[i][j]="黑桃";
                if(j==12)
                    poke[i][j]+="A";
                else if(j==11)
                    poke[i][j]+="K";
                else if(j==10)
                    poke[i][j]+="Q";
                else if(j==9)
                    poke[i][j]+="J";
                else
                    poke[i][j]+=String.valueOf(j+2);
            //System.out.println("poke["+i+"]["+j+"][1]="+poke[i][j][1]);//debug
            //System.out.println("poke["+i+"]["+j+"][0]="+poke[i][j][0]);//debug
            }
        }
        x1=(int)(Math.random()*3);
        y1=(int)(Math.random()*12);
        System.out.println("你抽到　"+poke[x1][y1]);
        do {
            x2=(int)(Math.random()*3);
            y2=(int)(Math.random()*12);
            //System.out.println("random");//debug
        } while (x1==x2&&y1==y2);
        System.out.println("對方抽到"+poke[x2][y2]);
        
        
        if(y1>y2||(y1==y2&&x1>x2))
            System.out.print("你贏了!");
        else
            System.out.print("對方贏了!");
    }
}