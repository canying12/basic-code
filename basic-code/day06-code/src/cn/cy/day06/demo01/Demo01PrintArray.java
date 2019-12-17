package cn.cy.day06.demo01;

import java.util.Arrays;

/*
    面向过程：当需要实现一个功能的时候，每一个具体的操作步骤都要亲力亲为，详细处理每一个细节
    面向对象：当需要实现一个功能的时候，不关心具体操作步骤，而是找一个具有该功能的人，来帮我做事
 */
public class Demo01PrintArray {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};

        //要求打印格式为：[10,20,30,40,50]
        //使用面向过程：每一个操作步骤都要亲力亲为
        System.out.print("[");
        for (int i = 0; i < 5; i++) {
            if (i == array.length - 1) {
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + ",");
            }

        }
        System.out.println("]");

        System.out.println("===========");
        //找到JDK给我们提供好的Arrays类，
        //其中有一个toString方法，直接就能把数组变成想要格式的字符串
        System.out.println(Arrays.toString(array));
    }
}
