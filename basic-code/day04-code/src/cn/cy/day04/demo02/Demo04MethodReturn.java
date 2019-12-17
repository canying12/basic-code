package cn.cy.day04.demo02;

public class Demo04MethodReturn {
    public static void main(String[] args) {
        System.out.println("返回值是："+sum(2, 6));
        printSum(6, 9);
    }

    //有返回值
    public static int sum(int a, int b) {
        return a + b;
    }

    //无返回值
    public static void printSum(int a, int b) {
        System.out.println("结果是："+a + b);
    }
}
