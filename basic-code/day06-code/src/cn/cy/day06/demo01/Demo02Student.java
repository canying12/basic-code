package cn.cy.day06.demo01;
/*
1.导包：指出使用的类在什么位置
import 包名.类名
import cn.cy.day06.demo01.Student
对于和当前类属于同一个包的情况，可以省略导包语句

2.创建
类名称 对象名 = new 类名称();
Student stu = new Student();

3.使用
使用成员变量：对象名.成变量
使用成员方法：对象名.成员方法(参数)

注意事项：
如果成员变量没有赋值，那么会有一个默认值，规则和数组一样。
 */
public class Demo02Student {
    public static void main(String[] args) {
        //1.导包
        //我需要使用Student类，和我自己Demo02Student位于同一包下，所以省略导包语句不写

        //2.创建，格式：
        //类名称 对象名 = new 类名称();
        //根据Student类，创建了一个名为stu的对象
        Student stu = new Student();

        //3.使用其中的成员变量，格式：
        //对象名.成员变量名
        System.out.println(stu.name);//null
        System.out.println(stu.age);//0

        System.out.println("==============");
        //改变成员变量中的数值内容
        //将右侧字符串，赋值交给stu对象中的name成员变量
        stu.name="赵丽颖";
        stu.age=18;
        System.out.println(stu.name);
        System.out.println(stu.age);

        //4.使用对象的成员方法，格式：
        //对象名.成员方法()
        stu.eat();
        stu.sleep();
        stu.study();
    }
}
