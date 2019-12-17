package cn.cy.day06.demo02;

public class Demo04PhoneParam {
    public static void main(String[] args) {
        Phone one = new Phone();
        one.brand="苹果";
        one.price=8388.0;
        one.color="土豪金";

        method(one);//传递进去的其实是一个地址
    }

    public static void method(Phone param){
        System.out.println(param.brand);//苹果
        System.out.println(param.price);//8338.0
        System.out.println(param.color);//土豪金

    }
}
