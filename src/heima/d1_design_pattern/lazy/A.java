package heima.d1_design_pattern.lazy;

public class A {
    //懒汉式单例模式,创建频率比较小时使用
    //2.私有化一个类变量储存对象，但不进行初始化
    private static A a;
    //1.私有化构造器
    private A(){
    }
    //3.定义一个类方法，保证第一次调用时创建对象，后面调用时返回相同对象
    public static A getObject(){
        if(a == null){
            System.out.println("first");
            a = new A();
        }
        return a;
    }
}
