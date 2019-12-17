package cn.cy.day04.demo02;

public class Demo02MethodDefine {
    public static void main(String[] args) {
        //单独调用
        sum(1, 2);
        //打印调用
        System.out.println(sum(1, 2));
        //赋值调用
        int number = sum(2, 5);
        System.out.println(number);
    }

    //定义两个数相加
    public static int sum(int a, int b) {
        System.out.println("方式执行啦");
        int result = a + b;
        return result;
    }
}
