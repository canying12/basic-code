package cn.cy.day07.demo03;

import java.util.Random;

/*
题目要求：
根据int变量n的值，来获取随机数字，返回是[1,n],可以取到1也可以取到n。

思路：
1.定义一个int变量n
2.使用Random：三个步骤：导包，创建，使用
3.如果写成10，那么就是0~9，然而想要1~10，可以发现：整体加1就行
4.打印随机数字

 */
public class Demo03Random {
    public static void main(String[] args) {
        int n=5;
        Random r=new Random();
        for (int i = 0; i < 100; i++) {
            int result=r.nextInt(n)+1;
            System.out.println(result);
        }

    }
}
