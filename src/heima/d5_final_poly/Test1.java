package heima.d5_final_poly;

public class Test1 {
    //成员变量用final修饰必须要创建时赋值
    //用static final修饰的变量被叫做常量，作用是记录系统的一些配置信息
    public static final String schoolname="asdasdsdf";

    public static void main(String[] args) {
        //认识final的作用
        //3.final修饰变量，变量就只能被赋值一次，有且仅能赋值依次
        //局部变量，成员变量：静态(static)成员变量，实例成员变量
        final int a;
        a=20;
        a=90;

        schoolname="asd";

        //引用类型变量指向地址不可以改，但是内容可以更改
        final int[] arr = {11,22,33};
        arr=null;
        arr[2]=1;
    }
    public void buy(final int z){
        z=90;
    }
}

//1.final修饰类，类就不能被继承：
final class A{

}
class B extends A{

}
//2.final修饰方法，方法就不能被重写
class C{
    public final void test(){

    }
}
class D extends C{
    @Override
    public void test(){

    }
}



