package cn.cy.day07.demo01;

import java.util.Scanner;

public class Demo03ScannerMax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        int a=sc.nextInt();
        System.out.println("请输入第二个数字：");
        int b=sc.nextInt();
        System.out.println("请输入第三个数字：");
        int c=sc.nextInt();

        //首先得到前两个数字的最大值
        int temp=a>b?a:b;
        int max=temp>c?temp:c;
        System.out.println("三个数字中的最大值为:"+max);
    }
}
