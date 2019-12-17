package cn.cy.day06.demo04;

public class Demo02Student {
    public static void main(String[] args) {
        Student stu1=new Student();//无参构造
        System.out.println("======");
        Student stu2=new Student("赵丽颖",20);//全参构造
        System.out.println("名字："+stu2.getName()+",年龄："+stu2.getAge());

        //如果需要改变对象中的成员变量数据内容，仍然还需要使用setXxx方法
        stu2.setAge(21);
        System.out.println("名字："+stu2.getName()+",年龄："+stu2.getAge());
    }
}
