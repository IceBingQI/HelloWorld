package cn.wzvtc.T;
//https://pintia.cn/problem-sets/14/problems/802
import java.util.Scanner;

public class T7_22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int tz=0,wg=0;
        int t1 = 0;
        int t2 = 1;
        int sleep = 0;
        while(t1<t){
            t1++;
            wg += 3;
            if ((t2 % 10) == 0 && tz > wg){
                if (sleep == 0){
                    tz += 9;
                    t2 += 31;
                    sleep = 1;
                }
            }
            if (t2 == t1){
                tz += 9;
                sleep = 0;
                t2++;
            }
        }
        if (tz > wg) {
            System.out.println("^_^ " + tz);
        } else if (tz < wg) {
            System.out.println("@_@ " + wg);
        } else {
            System.out.println("-_- " + tz);
        }
    }
}
