/*
7.設計一程式找出1到100間,所有能被7整除(7 divisable)的數.
*/

public class ex5_7{
    public static void main(String args[]){
        for(int i=1;i<=100;i++){
            if(i%7==0) {
                System.out.print(i+",");
            }
        }
    }
}
