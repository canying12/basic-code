package cn.cy.day04.demo03;

/*
题目要求：打印指定次数的Hello，World！！
 */
public class Demo03MethodPrint {
    public static void main(String[] args) {
        PrintCount(10);
    }

    //指定次数
    public static void PrintCount(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Hello,World!!");
        }
    }
}
