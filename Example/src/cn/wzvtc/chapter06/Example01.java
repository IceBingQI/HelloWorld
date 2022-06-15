package cn.wzvtc.chapter06;

public class Example01 {
    public static void main(String[] args) {
        a(5,4);
    }
    public static void a(int height,int width){
        for(int i = 0;i<height;i++){
            for (int j=0;j<width;j++){
                System.out.println("*");
            }
            System.out.println("\n");
        }
    }
}
