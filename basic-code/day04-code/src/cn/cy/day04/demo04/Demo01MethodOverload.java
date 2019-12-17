package cn.cy.day04.demo04;

public class Demo01MethodOverload {
    public static void main(String[] args) {
        System.out.println(sum(5, 6));
        System.out.println(sum(3, 5, 6));
        System.out.println(sum(6, 5, 4, 9));
    }

    //两个数相加
    public static int sum(int a, int b) {
        System.out.println("两个数相加执行了！");
        return a + b;
    }

    //三个数相加
    public static int sum(int a, int b, int c) {
        System.out.println("三个数相加执行了！");
        return a + b + c;
    }

    //四个数相加
    public static int sum(int a, int b, int c, int d) {
        System.out.println("四个数相加执行了！");
        return a + b + c + d;
    }
}
