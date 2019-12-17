package cn.cy.day04.demo04;

/*
题目要求：
    返回两个byte，两个char，两个short数据是否相等
 */
public class Demo02MethodOverloadSame {
    public static void main(String[] args) {
        char m = 'a';
        System.out.println(isSame((byte) 2, (byte) 3));
        System.out.println(isSame(m, m));
        System.out.println(isSame((short) 2, (short) 2));

    }

    public static boolean isSame(byte a, byte b) {
        return a == b;
    }

    public static boolean isSame(char a, char b) {
        return a == b;
    }

    public static boolean isSame(short a, short b) {
        return a == b;
    }
}
