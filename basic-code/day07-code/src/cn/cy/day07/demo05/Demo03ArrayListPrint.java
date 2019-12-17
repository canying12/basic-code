package cn.cy.day07.demo05;

import java.util.ArrayList;

/*
题目要求：
定义以指定格式打印集合的方法(ArrayList类型作为参数)，使用{}扩起集合，使用@分隔每个元素。格式参照 {元素 @元素@元素}。

System.out.println(list);    //[10,20,30]
printArrayList(list);//{10@20@30}
 */
public class Demo03ArrayListPrint {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("张三丰");
        list.add("宋远桥");
        list.add("张无忌");
        list.add("张三丰");
        System.out.println(list);
        printArrayList(list);
    }
    /*
    定义方法的三要素
    1.返回值类型：只是进行打印输出，没有运算，没有结果：所以用void
    2.方法名称：printArrayList
    3.参数列表：ArrayList
     */
    public static void printArrayList(ArrayList list){
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            String name= (String) list.get(i);
            if(i==list.size()-1){
                System.out.print(name);
            }else{
                System.out.print(name+"@");
            }
        }
        System.out.println("}");
    }
}
