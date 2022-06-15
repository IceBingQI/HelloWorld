package cn.wzvtc.T;

import java.util.Scanner;

public class L1_013 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = 0;
        int n = scanner.nextInt();
        while(n>0){
            int j = n;int t = 1;
            while (j > 0){
                t*=j;
                j--;
            }
            s+=t;
            n--;
        }
        System.out.println(s);
    }
}
