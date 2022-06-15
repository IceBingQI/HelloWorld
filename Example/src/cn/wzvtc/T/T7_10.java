package cn.wzvtc.T;

import java.util.Scanner;

public class T7_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double t = scanner.nextDouble();
        double w = scanner.nextDouble();
        double y;
        if(w<=40){
            if(t<5){
                y = w*30;
                System.out.println(String.format("%.2f",y));
            }else{
                y = w*50;
                System.out.println(String.format("%.2f",y));
            }
        }else{
            if(t<5){
                y = (40*30)+(1.5*(w-40)*30);
                System.out.println(String.format("%.2f",y));
            }else{
                y = (40*50)+(1.5*(w-40)*50);
                System.out.println(String.format("%.2f",y));
        }
        }
    }
}
