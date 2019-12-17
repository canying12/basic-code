package cn.cy.day04.demo03;

public class Demo01MethodSame {
    public static void main(String[] args) {
        System.out.println(isSame(1, 2));
    }

    //判断两个数是否相同
    public static boolean isSame(int a, int b) {
        boolean same = a == b;
        return same;

    }
}
