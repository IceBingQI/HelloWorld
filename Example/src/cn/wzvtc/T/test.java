package cn.wzvtc.T;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wg = 0,tz = 0;
        int t=scanner.nextInt();
        while(t > 0){
            if(tz > wg){
                if ( t >= 30){
                    wg += 30;
                    t -= 30;
                }else {
                    wg += 3 * t;
                    t = 0;
                }
            }
        }
    }
}
