package com.will.practice;
/*
請建立�??�PokeAndWin.java，含??��???10*10??��?�維?��??��?�並且隨機在裡面?��?��10?��?�中??��?��?��?��?��?�建立�??�PokeAndWinGame.java，輸?��行�?��?��?��?��?��?�傳??��?��?�中???

*/
import java.lang.*;
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
    }
}