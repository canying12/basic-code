package cn.cy.day07.demo04;

import java.util.ArrayList;

/*
ArrayList当中常用的方法有：

public boolean add(E e):向集合中添加元素，参数的类型和泛型一致。
备注：对于ArrayList来说，添加的动作一定是成功的，所以返回值可用可不用。返回值代表添加是否成功。
但是对于其他集合（今后学习）来说，添加动作不一定成功。

public E get(int index):从集合中获取元素，参数是索引编号，返回值就是对应位置的元素。
public E remove(int index):从集合中删除元素，参数是索引编号，返回值是被删除编号的元素。
public int size():获取集合的尺寸长度，返回值是集合中包含的元素个数。
 */
public class Demo03ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        System.out.println(list);

        //向集合中添加元素：add
        boolean success = list.add("刘岩");
        System.out.println(list);
        System.out.println("添加的动作是否成功："+success);

        list.add("高圆圆");
        list.add("赵又廷");
        list.add("李小璐");
        list.add("贾乃亮");
        System.out.println(list);//[刘岩, 高圆圆, 赵又廷, 李小璐, 贾乃亮]

        //从集合中获取元素：get。索引从零开始。
        String name=list.get(2);
        System.out.println("第2号索引位置："+name);

        //从集合中删除元素：remove。索引值从零开始。
        String whoRemoved = list.remove(3);
        System.out.println("被删除的人是："+whoRemoved);//李小璐
        System.out.println(list);//[刘岩, 高圆圆, 赵又廷, 贾乃亮]

        //获取集合的尺寸长度
        int size=list.size();
        System.out.println(size);//4


    }
}
