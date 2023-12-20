package heima.d7_Objects;

import java.util.Objects;

public class Test {
    public static void main(String[] args) {
        //目标，掌握objects的常用方法
        String s1 = "itheima";
        String s2 = "itheima";
        System.out.println(s1.equals(s2));
        System.out.println(Objects.equals(s1, s2));
        //空指针异常：
        String s3 = null;
        String s4 = "itheima";
        //System.out.println(s1.equals(s2));//报错，返回空指针异常
        System.out.println(Objects.equals(s1, s2));//函数做了非空校验
        System.out.println(Objects.isNull(s3));//判断是否是null
        Objects.nonNull(s3);//判断是否不是null

    }
}
