package cn.wzvtc.chapter04;

import java.util.Scanner;

public class Example01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mouth = scanner.nextInt();
        switch (mouth){
            case 3:
            case 4:
            case 5:
                System.out.println(mouth+"月是春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(mouth+"月是夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(mouth+"月是秋季");
                break;
            case 1:
            case 2:
            case 12:
                System.out.println(mouth+"月是冬季");
                break;
            default:
                System.out.println("输入有误");
        }
    }
}
