package cn.cy.day08.demo04;

/*
题目：
计算-10.8到5.9之间绝对值大于6或小于2.1的整数有多少个？

分析：
1.既然已经确定了范围，for循环
2.起点位置-10.8应该转换成-10，两种方法：
    2.1 Math.ceil方法，向上（向正方向）取整
    2.2 强转为int，自动舍弃小数位
3.每一个数字都是整数，所以步进表达式应该是num++，每次都是+1的。
4.如何拿到绝对值：Math.abs方法
5.一旦发现了一个数字就让计数器++统计
 */
public class Demo04MathPractise {
    public static void main(String[] args) {
        double min = -10.8;
        double max = 5.9;
        int num = 0;
        //这样处理，变量i就是区间之内所有整数
        for (int i = (int) min; i < max; i++) {
            int abs = Math.abs(i);
            if (abs > 6 || abs < Math.ceil(2.1)) {
                num++;
            }
        }
        System.out.println("个数为：" + num);
    }
}
