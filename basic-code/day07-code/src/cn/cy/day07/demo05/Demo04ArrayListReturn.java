package cn.cy.day07.demo05;

import java.util.ArrayList;
import java.util.Random;

/*
题目要求：
用一个大集合存入20个随机数字，然后筛选其中的偶元素，放到集合当中

分析：
1.需要创建一个集合，用来存int数字：<Integer>
2.随机数字就用Random nextInt
3.循环20次把随机数放在大集合中：for循环，add方法
4.定义一个方法，用来进行筛选。
筛选：根据大集合，筛选符合要求的元素，得到小集合。
三要素
返回值类型 ArrayList小集合(里面元素个数不确定)
方法名称   getSmallList
参数列表   ArrayList大集合（里面装着20个随机数）
5.判断（if）是偶数：num % 2==0
6.如果是偶数就放到小集合当中，否则不放
 */
public class Demo04ArrayListReturn {
    public static void main(String[] args) {
        ArrayList<Integer> bigList=new ArrayList<>();
        Random r=new Random();
        for (int i = 0; i < 20; i++) {
            bigList.add(r.nextInt());
        }
        System.out.println(bigList);

        ArrayList<Integer> smallList=getSmallList(bigList);
        System.out.println(smallList);
    }

    public static ArrayList<Integer> getSmallList(ArrayList<Integer> bigList){
        ArrayList<Integer> smallList=new ArrayList<>();
        for (int i = 0; i < bigList.size(); i++) {
            if(bigList.get(i)%2==0){
                smallList.add(bigList.get(i));
            }
        }
        return smallList;
    }
}
