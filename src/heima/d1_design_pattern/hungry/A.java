package heima.d1_design_pattern.hungry;

public class A {
    //单例设计模式；单例类/饿汉式单例模式
    //2、定义一个私有类变量记住A的一个对象：
    private static A a = new A();
    //1、必须私有化构造器
    private A(){

    }
    //3、定义一个类方法，返回A的对象，
    public static A getobject(){
        return a;
    }
    //使得主函数无论调多少次getobject，只会返回对象a,只会有一个对象
}
