/*
請建立一個WeatherBroacast.java類別，包含一個方法public static void forecast(double temperature, int humidityPercentage)，請依據不同的值印出對應的訊息
如果溫度小於3度且濕度大於80%，印出 「可能會下雪」
如果溫度大於20度且濕度大於80%，印出 「可能會下雨」
如果溫度大於30度且濕度小於40%，印出 「晴朗無雲好天氣」
如果溫度大於38度且濕度大於50%，印出 「悶熱，不要出門」
*/
import java.lang.*;
import java.util.Scanner;
public class WeatherBroacast{
    public static void main(String[] args) {
        double temp;
        int perce;
        Scanner scanner =new Scanner(System.in);
        System.out.print("輸入溫度:");
        temp = scanner.nextDouble();
        System.out.print("輸入濕度:");
        perce = scanner.nextInt();
        forecast(temp,perce);   
    }
    public static void forecast(double temperature, int humidityPercentage) {
        if(temperature < 3 && humidityPercentage > 80) {
            System.out.print("可能會下雪");
        } else if(temperature > 20 && humidityPercentage > 80) {
            System.out.print("可能會下雨");
        } else if(temperature > 30 && humidityPercentage < 40) {
            System.out.print("晴朗無雲好天氣");
        } else if(temperature > 38 && humidityPercentage > 50) {
            System.out.print("悶熱，不要出門");
        }
    }
}