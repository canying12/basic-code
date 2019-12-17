package cn.cy.day06.demo04;
/*
构造方法就是专门用于创建对象的方法，当我们通过关键字new来创建对象，其实就是在调用构造方法
格式：
public 类名称(参数类型 参数类型){方法体}

注意事项：
1.构造方法的名称必须和所在类名称完全一样，连大小写都一样
2.构造方法不要写返回值类型，连void都不写
3.构造方法不能return一个具体的返回值
4.没有编写任何构造方法，那么编译器将会默认赠送一个构造方法，没有参数、方法什么事情也不做
    public Student(){}
5.一旦编写了一个构造方法，编译器将不再赠送
6.构造方法重载：方法名相同，参数列表不同。

 */
public class Student {
    public Student(){
        System.out.println("无参构造方法执行了");
    }
    private String name;
    private int age;

    public Student(String name,int age){
        System.out.println("全参构造方法执行了");
        this.name=name;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
