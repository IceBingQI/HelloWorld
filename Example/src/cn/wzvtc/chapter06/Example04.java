package cn.wzvtc.chapter06;

public class Example04 {
    public static void main(String[] args) {
        print99(5);
        System.out.println();
        print99();
    }

    public static void print99(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" " + i + "*" + j + "=" + (i * j) + "\t");
                if (i == j) {
                    System.out.print("\n");
                }
            }
        }
    }
    public static void print99() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" " + i + "*" + j + "=" + (i * j) + "\t");
                if (i == j) {
                    System.out.print("\n");
                }
            }
        }
    }
}

