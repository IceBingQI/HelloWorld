package cn.wzvtc.T;

import java.util.Scanner;

public class T7_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s= scanner.nextInt();
        int t = scanner.nextInt();
        int m = s % 100;
        int h = s / 100;
        if(t>0){
            h += (m + t) / 60;
            h %= 24;
            m = (m + t) % 60;
            if(m < 10){
                System.out.println(h + "0" + m);
            }else{
                System.out.println(h + "" + m);
            }
        }else {
            h += ((m + t) / 60 - 1);
            m = 60 + (m + t) % 60;
            if (h < 0) {
                h = ((h% 24) +24)%24;
            }
            if (m < 10) {
                System.out.println(h + "0" + m);
            } else {
                System.out.println(h + "" + m);
            }
        }
    }
}
