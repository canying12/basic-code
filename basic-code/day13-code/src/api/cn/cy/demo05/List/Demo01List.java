package api.cn.cy.demo05.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
    java.util.List接口 extends Collection接口
    List接口的特点：
        1.有序的集合，存储元素和取出元素的顺序是一致的（存储123，取出123）
        2.有索引，包含了一些带索引的方法
        3.允许存储重复元素

    List接口中带索引的方法（特有）
        public void add(int index, E element) : 将指定的元素，添加到该集合中的指定位置上。
        public E get(int index) :返回集合中指定位置的元素。
        public E remove(int index) : 移除列表中指定位置的元素, 返回的是被移除的元素。
        public E set(int index, E element) :用指定元素替换集合中指定位置的元素,返回值的更新前的元素。

     注意：
        操作索引的时候，一定要防止索引越界异常
        outOfBoundsCheckIndex:索引越界异常，集合会报
        ArrayOutOfBoundsCheckIndex：数组索引越界异常
        StringOutOfBoundsCheckIndex:字符串索引越界异常
 */
public class Demo01List {
    public static void main(String[] args) {
        //创建一个List集合对象，多态
        List<String> list=new ArrayList<>();
        //使用add方法往集合中添加元素
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("a");
        //打印集合
        System.out.println(list);//[a, b, c, a] 不是地址重写了toString方法

        //public void add(int index, E element) : 将指定的元素，添加到该集合中的指定位置上。
        //在c和d之间添加一个chengxuyuan
        list.add(3,"chengxuyuan");
        System.out.println(list);

        //public E remove(int index) : 移除列表中指定位置的元素, 返回的是被移除的元素。
        //移除c元素
        String removeE = list.remove(2);
        System.out.println(removeE);
        System.out.println(list);

        //public E set(int index, E element) :用指定元素替换集合中指定位置的元素,返回值的更新前的元素。
        //把最后一个a替换为A
        String setE = list.set(4, "A");
        System.out.println("被替换的元素"+setE);//被替换的元素a
        System.out.println(list);//[a, b, chengxuyuan, d, A]

        //list遍历集合有三种方式
        //使用普通for循环
        for (int i = 0; i < list.size(); i++) {
            //public E get(int index) :返回集合中指定位置的元素。
            System.out.println(list.get(i));
        }
        System.out.println("==========");
        //使用迭代器
        Iterator<String> it=list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        //增强for循环
        for (String s : list) {
            System.out.println(s);
        }

        //String s = list.get(5);//outOfBoundsCheckIndex
        //System.out.println(s);
    }
}
