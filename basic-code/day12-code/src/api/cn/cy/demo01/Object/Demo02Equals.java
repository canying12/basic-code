package api.cn.cy.demo01.Object;

import java.util.ArrayList;

public class Demo02Equals {
    public static void main(String[] args) {
        /*
            Person类默认继承了Object类，所以可以使用Object中的equals方法
            equals(Object obj) 指示其他某个对象是否与此对象“相等”。
            equals方法的原码：
                public boolean equals(Object obj) {
                    return (this == obj);
                }
                参数：
                    Object obj：可以传递任意的对象
                    ==比较运算符，返回一个布尔值 true false
                    基本数据类型：比较的是值
                    引用数据类型：比较的是两个对象的地址值
                 this是谁？那个对象调用的方法，方法中的this就是那个对象；p1调用的equals方法所以this就是p1
                 obj是谁？传递过来的参数p2
                 this==obj-->p1==p2

         */
        Person p1=new Person("迪丽热巴",18);
        Person p2=new Person("古力娜扎",19);
        System.out.println("p1"+p1);//api.cn.cy.demo01.Object.Person@75412c2f
        System.out.println("p2"+p2);//api.cn.cy.demo01.Object.Person@282ba1e

        //p1=p2;//把p2的地址值赋值给p1
        ArrayList<Integer> list=new ArrayList<>();
        boolean b = p1.equals(null);
        System.out.println(b);
    }
}
