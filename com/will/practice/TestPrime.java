package com.will.practice;
/*
請建立�??�TestPrime.java，可輸出0~100??��???��?�質?��
*/
import java.util.Scanner;
public class TestPrime{
    public static void main(String[] args) {
        for(int i=1; i<=100; i++) {
            if(PrimeCaculator.run(i))
                System.out.print(i+",");  
        }
    }
    public static boolean prime(int x) {
        if(x==1)
            return false;
        for(int i=2; i<=x/2; i++) {
            if(x%i==0) 
                return false;
        }
        return true;
    }
}