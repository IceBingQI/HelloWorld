package cn.wzvtc.moniti;

import java.util.Scanner;

public class Example04 {
    public static void main(String[] args) {
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while (n!=0){
            if (n > 0) {
                int k = (int) Math.sqrt(n);
                for (int i = 2; i <= k; i++) {
                    if (n % i == 0) {
                        flag = false;
                        break;
                    }
                }
            }else{
                System.out.println("输入有误！");
            }
            if (flag) {
                System.out.println("yes");
                break;
            } else {
                System.out.println("no");
                break;
            }
        }
    }
}
