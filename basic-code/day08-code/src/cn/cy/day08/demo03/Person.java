package cn.cy.day08.demo03;
/*
静态代码块的格式：
public class 类名称{
    static{
        //静态代码块的内容
    }
}

特点：当第一次用到本类时，静态代码块执行唯一的一次。
 */
public class Person {
    static{
        System.out.println("静态代码快执行了！");
    }

    public Person(){
        System.out.println("构造方法执行了！");
    }
}
