package cn.cy.day06.demo02;

public class Demo01PhoneOne {
    public static void main(String[] args) {
        Phone one = new Phone();
        System.out.println(one.brand);//null
        System.out.println(one.price);//0.0
        System.out.println(one.color);//null

        System.out.println("==========");
        one.brand = "苹果";
        one.price = 6446.8;
        one.color = "黑色";
        System.out.println(one.brand);//苹果
        System.out.println(one.price);//6444.6
        System.out.println(one.color);//黑色

        one.call("乔布斯");
        one.sedMessage();

    }
}
