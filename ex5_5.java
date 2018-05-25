/*
5.輸入正整數n,印出如下各種高為n的三角形(triangle)或四方形(square):
	(假設n=5)
	(a)			  (b)			(c)
		*			     *			    *
		**			    **			   ***
		***			   ***			  *****
		****		  ****	    	 *******
		*****		 *****	        *********
	(d)			(e)
		*****			*****
		*****			*   *
		*****			*   *
		*****			*   *
		*****			*****
*/
import java.util.Scanner;

public class ex5_5{
    public static void main(String args[]){
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("n=");
        n = scanner.nextInt();
        System.out.println("(a)");
        for(int x = 0; x < n; x++){
            for(int y = 0; y <= x; y++){
                System.out.print("*");  
            }
            System.out.println("");
        }

        System.out.println("(b)");
        for(int x = 1; x <= n; x++){
            for(int y = 1; y <= n; y++){
                if(y<=n-x){
                    System.out.print(" ");      
                } else {
                    System.out.print("*");  
                }
                
            }
            System.out.println("");
        }
        System.out.println("(b)");
        for(int x = 1; x < n+1; x++){
            int z=n-x;
            while(z>0) {
                System.out.print(" ");      
                z--;
            }
            for(int y = 0; y < x; y++){
                
                System.out.print("*");  
            }
            System.out.println("");
        }
        
        System.out.println("(c)");
        for(int x = 0; x < n*2-1; x+=2){
            int z=n-x/2;
            while(z>0) {
                System.out.print(" ");      
                z--;
            }
            for(int y = 0; y <= x; y++){
                System.out.print("*");  
            }
            System.out.println("");
        }
        System.out.println("(d)");
        for(int x = 1; x <= n ; x++){
            for(int y = 1; y <= n ; y++){
                
                System.out.print("*");  
            }
            System.out.println("");
        }
        System.out.println("(e)");
        for(int x = 1; x <= n ; x++){
            for(int y = 1; y <= n ; y++){
                
                if(x==1||x==n||y==1||y==n){
                    System.out.print("*");  
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        System.out.println("x,y");
        for(int i = 1; i <= n ; i++){
            for(int j = 1; j <= n ; j++){
                
                System.out.print(i+","+j+" ");  
            }
            System.out.println("");
        }
    }
}
