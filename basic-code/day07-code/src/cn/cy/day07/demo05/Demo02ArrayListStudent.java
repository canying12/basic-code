package cn.cy.day07.demo05;

import java.util.ArrayList;

/*
题目：
自定义4个学生对象,添加到集合,并遍历

思路：
1.自定义学生类，四个部分
2.创建一个集合，用来存储学生对象。泛型<Student>
3.根据类，创建四个学生对象
4.将4个学生对象添加到集合中：add
5.遍历集合：size，for，get
 */
public class Demo02ArrayListStudent {
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();

        Student one=new Student("洪七公",20);
        Student two=new Student("欧阳锋",21);
        Student three=new Student("黄药师",22);
        Student four=new Student("段智兴",23);

        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);

        for (int i = 0; i < list.size(); i++) {
            System.out.println("姓名是："+list.get(i).getName()+",年龄："+list.get(i).getAge());
        }
    }
}
