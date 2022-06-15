package cn.wzvtc.T;

import java.util.Scanner;

public class T7_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String[] time = s.split(":");
        int h = Integer.parseInt(time[0]);
        int m = Integer.parseInt(time[1]);
        String t = ":";
        if (h > 12){
            System.out.println(h-12+t+m+" PM");
        }else if( h == 12){
            System.out.println(h+t+m+" PM");
        }else{
            System.out.println(h+t+m+" AM");
        }
    }
}
//暂未学会，只是参考答案