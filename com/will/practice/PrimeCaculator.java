package com.will.practice;
/*
請建立一個PrimeCaculator.java，並寫一個方法run，輸入一個數字後，回傳是不是質數
輸入一個數字n，n如果能被從2 ~ n/2的數任一個數整除，就不是質數
寫一個main方法，去產生一個PrimeCaculator實體，並執行run方法
*/
import java.util.Scanner;
public class PrimeCaculator{
    public static boolean run(int x) {
        if(x==1)
            return false;
        for(int i=2; i<=x/2; i++) {
            if(x%i==0) 
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入數字:");
        int i = scanner.nextInt();
        scanner.close();
        if(run(i))
            System.out.print(i+"是質數");
        else
            System.out.print(i+"不是質數");
    }
}