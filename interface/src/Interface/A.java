package Interface;

public interface A {
    //接口中定义的成员变量默认常量：
    String schoolname = "黑马程序员";
    //接口中定义的成员方法，默认为抽象方法,
    // 所以不能写方法体
    void test();
    //接口中不能写构造器，不能写代码块，也不能创建对象
    //比抽象类更抽象

}
