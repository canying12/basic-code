package api.cn.cy.demo07.Integer;

import java.util.ArrayList;

/*
    自动装箱与自动拆箱：基本类型的数据和包装类型之间可以相互转换
    JDK1.5之后出现的新特性
 */
public class Demo02Integer {
    public static void main(String[] args) {
        /*
            自动装箱:直接把int类型的整数赋值给包装类
            Integer in=1;就相当于Integer in=new Integer(1);
         */
        Integer in=1;

        /*
            自动拆箱：in是包装类，无法直接参与运算，自动转换为基本数据类型进行计算
            in+2;就相当于in.intValue()+2
            in=in.intValue()+2=3有是一个自动装箱
         */
        in=in+2;

        ArrayList<Integer> list=new ArrayList<>();
        /*
            ArrayList无法直接存储整数，可以存储Integer包装类
         */
        list.add(1);//-->自动装箱 list.add(new Integer(1));

        int a = list.get(0);//-->自动拆箱 list.get(0).IntValue();
    }
}
