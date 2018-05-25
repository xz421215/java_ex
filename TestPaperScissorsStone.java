/*
3.請建立一個TestPaperScissorsStone.java，每一回合，選一個手勢來出，而電腦隨機選擇一個，再印出各自的手勢，以及誰贏了
透過Scanner類別，可以從鍵盤上輸入手勢
*/
import java.lang.*;
import java.util.Random;
import java.util.Scanner;
public class TestPaperScissorsStone{
    public static void main(String[] args) {
        int youGesture,botGesture;
        Scanner scanner =new Scanner(System.in);
        do{
            System.out.print("1.剪刀,2.石頭,3.布:");
            botGesture = (int)(Math.random()*3)+1;
            youGesture = scanner.nextInt();
            //System.out.println(youGesture+","+botGesture);//debug
            paperScissorsStone(youGesture,botGesture);
        } while (true);
    }
    public static void paperScissorsStone(int Gesture1,int Gesture2) {
        if(Gesture1==Gesture2) {
            System.out.println("平手");
        } else if((Gesture1==1&&Gesture2==3)||(Gesture1==2&&Gesture2==1)||(Gesture1==3&&Gesture2==2)) {
            System.out.println("你贏了");
        } else {
            System.out.println("你輸了");
        }
    }
}