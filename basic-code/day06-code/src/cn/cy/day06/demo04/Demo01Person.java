package cn.cy.day06.demo04;

public class Demo01Person {
    public static void main(String[] args) {
        Person person=new Person();

        //设置我自己的名字
        person.name="王建林";
        person.sayHello("王思聪");
        System.out.println(person);
    }
}
