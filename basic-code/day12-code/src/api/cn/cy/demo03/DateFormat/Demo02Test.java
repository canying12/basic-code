package api.cn.cy.demo03.DateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
    练习：请使用日期相关的API，计算一个人出生了多少天。
    分析：
        1.使用Scanner类中的next方法，获取出生日期
        2.使用DateFormat类中的parse方法，把字符串的出生日期，转换为Date格式的出生日期
        3.把Date格式的出生日期转换为毫秒值
        4.获取当前日期，也转换为毫秒值
        5.使用当前日期的毫秒值-出生日期的毫秒值
        6.把毫秒的差值转换为天
 */
public class Demo02Test {
    public static void main(String[] args) throws ParseException {
       // 1.使用Scanner类中的next方法，获取出生日期
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你的出生日期，格式为：yyyy-MM-dd");
        String birthdayString = sc.next();
        //2.使用DateFormat类中的parse方法，把字符串的出生日期，转换为Date格式的出生日期
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Date birthdayDate = sdf.parse(birthdayString);
        //3.把Date格式的出生日期转换为毫秒值
        long birthdayTime = birthdayDate.getTime();
        // 4.获取当前日期，也转换为毫秒值
        Date date = new Date();
        long nowTime = date.getTime();
        //5.使用当前日期的毫秒值-出生日期的毫秒值
        long l = nowTime - birthdayTime;
        // 6.把毫秒的差值转换为天
        int dayNum= (int) (l/(24*60*60*1000));
        System.out.println("你已经出生了"+dayNum+"天");
    }
}
