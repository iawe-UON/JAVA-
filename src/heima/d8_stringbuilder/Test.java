package heima.d8_stringbuilder;

public class Test {
    public static void main(String[] args) {
        //目标：了解stringbuilder的用法
        //String是不可变字符串，Stringbuilder是可变字符串容器
        StringBuilder s1 = new StringBuilder("itheima");
        //1、拼接内容
        s1.append("heima");
        s1.append(2);
        s1.append("jjjj");
        System.out.println(s1);
        //2、支持链式编程
        s1.append("heima").append(12).append(12);
        //3、reverse:反转操作
        s1.reverse();
        System.out.println(s1);
        //4返回字符串的长度
        System.out.println(s1.length());
        //5、把stringbuilder类型转化成String
        String rs = s1.toString();
        System.out.println(rs);
        //Stringbuffer跟stringbuild作用一样，但是前者是线程安全的，后者是线程不安全的
        //后者会出现并发问题

    }
}
