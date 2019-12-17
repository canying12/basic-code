package cn.cy.day07.demo04;

import java.util.ArrayList;
/*
如果希望向ArrayList集合中存储基本数据类型，必须使用基本类型对应的“包装类”

基本类型        包装类（引用类型，包装类都位于java.lang包下）
byte            Byte
short           Short
char            Character【特殊】
int             Integer【特殊】
long            Long
float           Float
double          Double
boolean         Boolean

从JDK1.5+开始，支持自动装箱，自动拆箱。
自动装箱:基本类型-->引用类型
自当拆箱:引用类型-->基本类型
 */
public class Demo05ArrayListBasic {
    public static void main(String[] args) {
        ArrayList<String> listA=new ArrayList<>();
        //错误写法，泛型只能是引用数据类型，不能是基本数据类型
        //ArrayList<int> listB=new ArrayList<>();

        ArrayList<Integer> listC=new ArrayList<>();
        listC.add(100);
        listC.add(200);
        System.out.println(listC);

        int num=listC.get(1);
        System.out.println("第1号元素是："+num);

    }
}
