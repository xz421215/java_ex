/*
建立一個DiceUtils類別，包含一個方法 int dice()，呼叫後會回傳1到6其中任意一個數字
提示: Math.random()
*/
import java.lang.*;
public class DiceUtils{
    public static void main(String[] args) {
        System.out.print(dice());    
    }
    public static int dice() {
        return (int)(Math.random()*6+1);  
    }
}