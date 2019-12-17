package cn.cy.day08.demo02;

import java.util.Scanner;

/*
题目：
键盘录入一个字符，统计字符串中大小写字母及数字字符个数
种类有：数字、小写字母、大写字母、其他

思路：
1.既然用到键盘输入、肯定用到Scanner
2.键盘输入的是字符串，那么：String str=sc.next()
3.定义四个变量，分别代表四种字符各自出现的次数。
4.需要对字符串一个字、一个字检查，String-->char[],方法就是toCharArray()
5.遍历char[]字符数组，对当前字符种类进行判断，并且用四个变量进行++操作。
6.打印输出四个变量分别代表四种字符出现的次数。
 */
public class Demo07StringCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String input = sc.next();//获取键盘输入的一个字符串

        int countUpper=0;//大写字母
        int countLower=0;//小写字母
        int countNumber=0;//数字
        int countOther=0;//其他

        char[] charArray = input.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char ch=charArray[i];//当前单个字符
            if(charArray[i]>='A'&& charArray[i]<='Z'){
                countUpper++;
            }else if(charArray[i]>='a'&& charArray[i]<='z'){
                countLower++;
            }else if(charArray[i]>='0'&& charArray[i]<='9'){
                countNumber++;
            }else{
                countOther++;
            }
        }

        System.out.println("大写字母数："+countUpper);
        System.out.println("小写字母数："+countLower);
        System.out.println("数字："+countNumber);
        System.out.println("其他："+countOther);
    }
}
