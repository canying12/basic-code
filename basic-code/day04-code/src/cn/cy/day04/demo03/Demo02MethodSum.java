package cn.cy.day04.demo03;

/*
 * 题目要求：
 *   定义一个方法，定义一个方法求出1-100的方法
 * */
public class Demo02MethodSum {
    public static void main(String[] args) {
        System.out.println(getSum());
    }

    //方法
    public static int getSum() {
        int sum = 0;
        for (int i = 1; i < 100; i++) {
            sum += i;
        }
        return sum;
    }
}
