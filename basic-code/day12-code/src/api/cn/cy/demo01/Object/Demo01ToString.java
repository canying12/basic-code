package api.cn.cy.demo01.Object;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/*
    java.lang.Object
    类 Object 是类层次结构的根类。
    每个类(Person,Student)都使用 Object 作为超类。
    所有对象（包括数组）都实现这个类的方法。
 */
public class Demo01ToString {
    public static void main(String[] args) {
        /*
            Person类默认继承成了Object类，所以可以使用Object中的toString方法
            String toString() 返回该对象的字符串表示
         */
        Person p = new Person("张三", 18);
        String s = p.toString();
        System.out.println(s);//api.cn.cy.demo01.Object.Person@75412c2f

        //直接打印对象的名字，其实就是调用对象的toString方法
        System.out.println(p);//api.cn.cy.demo01.Object.Person@75412c2f

        //看一个类是否重写了toString方法，直接打印这个类的对象即可，如果没有重写toString方法
        //那么打印的是对象的地址值
        Random r=new Random();
        System.out.println(r);//java.util.Random@3f3afe78

        Scanner sc=new Scanner(System.in);
        System.out.println(sc);//java.util.Scanner[delimiters=\p{javaWhitespace}+][position=0]++..

        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);//[1, 2, 3]

    }
}
