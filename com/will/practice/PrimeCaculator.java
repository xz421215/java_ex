package com.will.practice;
/*
隢遣蝡??rimeCaculator.java嚗蒂撖思??瘜un嚗撓?銝??摮????銝鞈芣
頛詨銝??摮嚗憒?鋡怠??2 ~ n/2??隞颱????嚗停銝鞈芣
撖思??ain?瘜??????rimeCaculator撖阡??蒂?銵un?瘜?
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
        System.out.print("隢撓??摮?:");
        int i = scanner.nextInt();
        scanner.close();
        if(run(i))
            System.out.print(i+"?鞈芣");
        else
            System.out.print(i+"銝鞈芣");
    }
}