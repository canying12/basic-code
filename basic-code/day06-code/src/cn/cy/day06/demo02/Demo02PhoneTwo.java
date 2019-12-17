package cn.cy.day06.demo02;

public class Demo02PhoneTwo {
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

        System.out.println("====================");
        Phone two = new Phone();
        System.out.println(two.brand);//null
        System.out.println(two.price);//0.0
        System.out.println(two.color);//null

        System.out.println("==========");
        two.brand = "三星";
        two.price = 5999;
        two.color = "蓝色";
        System.out.println(two.brand);//苹果
        System.out.println(two.price);//6444.6
        System.out.println(two.color);//黑色

        two.call("欧巴");
        two.sedMessage();
    }
}
