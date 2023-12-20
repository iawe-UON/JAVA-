package heima.d7_intger;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        //目标：认识包装类
        //把类型数据包装成对象
        //Integer a1 = new Integer(12);过时方法，报错
        Integer a1 = Integer.valueOf(12);
        System.out.println(a1);
        //自动装箱:自动把基本类型转化成对象
        Integer a2 =12;
        //自动拆箱：自动把对象转化成基本类型
        int a3 = a2;
        //注意，泛型和集合不支持基本数据类型，只支持对象
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);//自动装箱
        int a5 = list.get(0);
        System.out.println(a5);
        //包装类其他常见动作：
        Integer a = 23;
        String s1 = a.toString();
        String s11 = Integer.toString(a);
        String s111 = a+"";//直接转化成字符串类型
        //
        //把字符串类型数据转化成对应的基本类型
        String s2 = "29";
        int a22 = Integer.parseInt(s2);
        String s22 = "2.333";
        double d22 = Double.parseDouble(s22);//其余同理
        //更优秀的方案
        String s21 = "29";
        int a221 = Integer.valueOf(s2);
        String s221 = "2.333";
        double d221 = Double.valueOf(s22);//valuof也可以转换

    }
}
