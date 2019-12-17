package api.cn.cy.demo06.StringBuilder;
/*
    StringBuilder的常用方法：
        public StringBuilder append(...)：添加任意类型数据的字符串形式，并返回当前对象自身。
        public String toString()：将当前StringBuilder对象转换为String对象。
 */
public class Demo02StringBuilder {
    public static void main(String[] args) {
        //创建StringBuilder对象
        StringBuilder bu = new StringBuilder();
        //使用append()方法往StringBuilder中添加数据
        //使用append方法返回的是this，调用方法的bu，this==bu
        //StringBuilder bu2 = bu.append("abc");//把bu的地址值赋值给bu2
        //System.out.println("bu:"+bu);//bu:abc
        //System.out.println("bu2:"+bu2); //bu2:abc
        //ystem.out.println(bu==bu2);//true

        //使用append无需接收返回值
        bu.append("abc");
        bu.append(1);
        bu.append(true);
        bu.append(8.8);
        bu.append('中');
        System.out.println("bu"+bu);

        /*
            链式编程：方法返回值是一个对象，可以继续调用方法

         */
        System.out.println("abc".toUpperCase().toLowerCase().toUpperCase().toLowerCase().toUpperCase());
        bu.append("abc").append(1).append(true).append(8.8).append('中');
        System.out.println(bu);
    }
}
