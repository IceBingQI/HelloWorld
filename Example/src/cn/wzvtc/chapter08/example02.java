package cn.wzvtc.chapter08;

import java.util.Scanner;

public class example02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] x = new int[10];
        int i;
        for (i = 0;i < x.length;i++){
            x[i] = scanner.nextInt();
            if (x[i]==0){
                break;
            }
        }
        boolean end = sort(x,i);
        if (end){
            System.out.println("已排序");
        }else {
            System.out.println("未排序");
        }
    }
    public static boolean sort(int[] x,int length){
        for (int i = 0;i < length-1;i++){
            if (x[i] > x[i+1]){
                return false;
            }
        }
        return true;
    }
}
