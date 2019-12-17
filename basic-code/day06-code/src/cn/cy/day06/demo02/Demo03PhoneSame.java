package cn.cy.day06.demo02;

public class Demo03PhoneSame {
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
        //将将one中保存的对象地址值赋值给two
        Phone two = one;
        System.out.println(two.brand);//苹果
        System.out.println(two.price);//644.8
        System.out.println(two.color);//黑色

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
