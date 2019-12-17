package cn.cy.day08.demo03;

public class Demo03StaticMethod {
    public static void main(String[] args) {
        //首先设置一个教室，这是一个静态的东西，应该通过类名称进行调用
        Student.room="101教室";

        Student one=new Student("郭靖",19);
        System.out.println("one的姓名："+one.getName());
        System.out.println("one的年龄："+one.getAge());
        System.out.println("one的教室"+Student.room);

        System.out.println("==================");
        Student two=new Student("黄蓉",16);
        System.out.println("one的姓名："+two.getName());
        System.out.println("one的年龄："+two.getAge());
        System.out.println("one的教室"+Student.room);
    }
}
