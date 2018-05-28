package com.will.practice;
/*
請建立一個PokeAndWin.java，含有一個10*10的二維陣列，並且隨機在裡面放入10個有中獎的紙條，
再建立一個PokeAndWinGame.java，輸入行和列之後，回傳有沒有中獎

*/
import java.lang.*;
import java.util.Scanner;
public class PokeAndWinGame{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean[][] poke;
        poke = new boolean[10][10];
        int x,y,j,k;
        for(int i=1; i<=10; i++) {
            do {
                x=(int)(Math.random()*9);
                y=(int)(Math.random()*9);
                //System.out.println(i+" "+x+","+y+":"+poke[x][y]); //debug
            } while (poke[x][y]);
            poke[x][y]=true;
        }
        //System.out.println(x+","+y); //debug
        do {
        System.out.printf("行:");
        j=scanner.nextInt();
        System.out.printf("列:");
        k=scanner.nextInt();
        if(poke[j][k])
            System.out.println("中獎");
        else
            System.out.println("未中獎");
        } while (true);    
    }
}