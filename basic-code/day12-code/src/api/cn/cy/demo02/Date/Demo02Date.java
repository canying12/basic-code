package api.cn.cy.demo02.Date;

import java.util.Date;

public class Demo02Date {
    public static void main(String[] args) {
        demo01();
        demo02();
        demo03();
    }

    /*
    getTime() 把日期转换为毫秒值（相当于System.currentTimeMillis()方法）
          返回自 1970 年 1 月 1 日 00:00:00 GMT 以来此 Date 对象表示的毫秒数。
     */
    private static void demo03() {
        Date date=new Date();
        System.out.println(date.getTime());//1575965492170
    }

    /*
        Date类的带参数的构造方法
        Date(long date):传递毫秒值，把毫秒值转换为Date日期
     */
    private static void demo02() {
        Date date=new Date(0L);
        System.out.println(date);//Thu Jan 01 08:00:00 CST 1970

        date=new Date(1575963909421L);
        System.out.println(date);//Tue Dec 10 15:45:09 CST 2019
    }

    /*
        Date类的空参构造方法
        Date()获取当前系统的日期和时间
     */
    private static void demo01() {
        Date date=new Date();
        System.out.println(date);//Tue Dec 10 15:56:18 CST 2019
    }
}
