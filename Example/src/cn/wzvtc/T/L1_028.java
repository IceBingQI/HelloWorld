package cn.wzvtc.T;

import java.util.Scanner;

public class L1_028 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1;i<=n;i++){
            int x = scanner.nextInt();
            boolean flag = true;
            for(int j=2; j<Math.sqrt(x); j++) {
                if(x % j == 0){
                    flag = false;
                    break;
                }
            }
            if (flag == true) {
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
        }

    }
}
