package api.cn.cy.demo04Calendar;

import java.util.Calendar;
import java.util.Date;

/*
    Calendar中的成员方法：
        public int get(int field):返回给定日历字段的值。
        public void set（int field,int value）:将给定的日历字段设置为给定值。
        public abstract void add(int field,int count):根据日历的规则，为给定的日历字段添加或减去指定的时间量。
        public Date getTime():返回一个表示此Calendar时间值：

    成员方法参数：
        int field：日历类的字段，可以使用Calendar类的静态成员变量获取
            public static final int YEAR = 1; 年
            public static final int MONTH = 2; 月
            public static final int DATE = 5; 月中的某一天
            public static final int DAY_OF_MONTH = 5; 月中的某一天
            public static final int HOUR = 10; 时
            public static final int MINUTE = 12; 分
            public static final int SECOND = 13; 秒
 */
public class Demo02Calendar {
    public static void main(String[] args) {
        demo01();
        demo02();
        demo03();
        demo04();
    }
    /*
        public Date getTime():返回一个表示此Calendar时间值(从元年到现在的毫秒偏移量)的Date对象。
        把日历对象，转换为日历对象


     */
    private static void demo04() {
        //通过getInstance获取Calendar对象
        Calendar c=Calendar.getInstance();
        Date time = c.getTime();
        System.out.println(time);
    }

    /*
        public abstract void add(int field,int count):根据日历的规则，为给定的日历字段添加或减去指定的时间量。
        把指定的字段增加或减少指定的值
        参数：
            int field:传递指定的日历字段（YEAR，MONTH）
            int amount：增加/减少指定的值
                正数：增加
                负数：减少

     */
    private static void demo03() {
        //通过getInstance获取Calendar对象
        Calendar c=Calendar.getInstance();

        //把年增加2年
        c.add(Calendar.YEAR,2);

        //减少3个月
        c.add(Calendar.MONTH,-3);
        int year = c.get(Calendar.YEAR);
        System.out.println(year);

        int month=c.get(Calendar.MONTH);
        System.out.println(month+1);//西方的月份0-11   东方：1-12

        int day = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);
    }

    /*
        public void set（int field,int value）:将给定的日历字段设置为给定值。
        参数：
            int field:传递指定的日历字段（YEAR，MONTH）
            int value:给指定字段设置值

     */
    private static void demo02() {
        //通过getInstance获取Calendar对象
        Calendar c=Calendar.getInstance();
        //设置年为9999
        c.set(Calendar.YEAR,9999);

        //设置月为9月
        c.set(Calendar.MONTH,9);

        //设置日9日
        c.set(Calendar.DAY_OF_MONTH,9);

        //同时设置年、月、日，可以使用set的重载方法
        c.set(8888,8,8);


        int year = c.get(Calendar.YEAR);
        System.out.println(year);

        int month=c.get(Calendar.MONTH);
        System.out.println(month+1);//西方的月份0-11   东方：1-12

        int day = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);
    }

    /*
         public int get(int field):返回给定日历字段的值。
         参数：传递指定的日历字段（YEAR，MONTH）
         返回值：日历字段代表的具体值

     */
    private static void demo01() {
        Calendar c=Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        System.out.println(year);

        int month=c.get(Calendar.MONTH);
        System.out.println(month+1);//西方的月份0-11   东方：1-12

        int day = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);
    }
}
