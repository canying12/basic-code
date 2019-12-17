package api.cn.cy.demo02.Date;
/*
    java.util.Date:表示日期和时间类
    类Date表示特定的时间，精确到毫秒。
    毫秒：千分之一秒1000毫秒=1秒
    特定的瞬间：一个时间点，一刹那时间
    2088-08-08 09:55:33:333 瞬间
    2088-08-08 09:55:33:334 瞬间
    2088-08-08 09:55:33:335 瞬间
    ...
    毫秒值的作用：可以对时间和日期进行计算
    2099-01-03 到 2088-01-01 中间一个有多少天
    把日期转换成毫秒进行计算，计算完毕，再把毫秒转换成刚日期

    把日期转换成毫秒：
        当前日期：2088-01-01
        时间原点(0毫秒)：1970 年 1 月 1 日 00:00:00 （英国格林威治）
        就是计算当前日期到时间原点之间一共经历了多少毫米（1575963909421L）
    注意：
        中国属于东八区，会把时间增加8个小时
        1970 年 1 月 1 日 08:00:00
    把毫秒转换成日期：
        1天=1 天 = 24 × 60 × 60 = 86400 秒  =86400 * 1000 = 86400000毫秒
 */
public class Demo01Date {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());//获取当前系统一共到1970 年 1 月 1 日 00:00:00经历了多少毫秒。
    }
}