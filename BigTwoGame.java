/*
建立一個BigTwoGame.java類別，包含一個方法，PokerCard[][] deal() 將52張牌洗亂之後，回傳一個4*13的巢狀陣列，


*/
import java.lang.*;
import java.util.Scanner;
public class BigTwoGame{
    public static void main(String[] args) {
        String[] PokerCard = new String[52];
        String[] Temp = new String[52];
        String[][] handCard = new String[4][13];
        int j;
        for(int i=0; i<52; i++) {
            do {
            
                j=(int)(Math.random()*51);
            } while (Temp[i]);
            Temp[j]=PokerCard[i];
        }
        PockerCard[]=Temp[];
        for(int x=0; x<4; x++) {
            for(int y=0; y<13; y++) {
            int randomNum=(int)Math.random()*51;
            handCard[x][y]=Temp[randomNum];
            Temp[randomNum]="";
            System.out.print(handCard[x][y]);
            }
        }
 
    }
}