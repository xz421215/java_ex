import java.lang.*;
public class DiceUtils{
    public static void name(String args[]) {
        System.out.print(dice());    
    }
    public static double dice() {
        return (Math.random()*(6-1)+1);  
    }
}