/*
請建立一個PokeAndWin.java，含有一個10*10的二維陣列，並且隨機在裡面放入10個有中獎的紙條，再建立一個PokeAndWinGame.java，輸入行和列之後，回傳有沒有中獎

*/
import java.lang.*;
import java.util.Scanner;
public class PokeAndWin{
    public static void main(String[] args) {
        boolean[][] poke;
        poke = new boolean[10][10];
        int x,y;
        for(int i=1; i<=10; i++) {
            do {
                x=(int)(Math.random()*9);
                y=(int)(Math.random()*9);
                //System.out.println(i+" "+x+","+y+":"+poke[x][y]); //debug
            } while (poke[x][y]);
            poke[x][y]=true;
            //System.out.println(x+","+y); //debug
        }
/*
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入數字:");
        int i = scanner.nextInt();
        if(prime(i))
            System.out.print(i+"是質數");
        else
            System.out.print(i+"不是質數");
*/
    }
}