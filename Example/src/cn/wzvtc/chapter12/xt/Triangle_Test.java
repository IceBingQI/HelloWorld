package cn.wzvtc.chapter12.xt;

public class Triangle_Test {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(5,5,5);
        triangle.isRightTriangle();
        System.out.println("直角三角形："+triangle.isRightTriangle());
        triangle.isIsoscelesTriangle();
        System.out.println("等腰三角形："+triangle.isIsoscelesTriangle());
        triangle.isEquilateralTriangle();
        System.out.println("等边三角形："+triangle.isEquilateralTriangle());
        triangle.getArea();
        System.out.printf("面积：%.2f\n",triangle.getArea());
        triangle.getLength();
        System.out.println("周长："+triangle.getLength());
    }
}