package heima.d6_abstract;

public abstract class A {//创建抽象类
    private String name;
    //抽象方法：必须用abstract修饰，只有方法签名，一定不能有方法体
    public abstract void run();
    //1.抽象类不一定有抽象方法，但是抽象方法一定有抽象类
    //2.类该有的成员抽象类都有

    public A() {
    }

    public A(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //3.抽象类不能创建对象，仅作为一种特殊的父类，让子类继承来进行实现，提高代码的复用性
    //4.一个类如果继承了抽象方法，那么必须全部重写父类的抽象方法，否则它本身也是抽象类
    //抽象类的好处：抽象类不是非必须的写法，存在目的是为了更好的支持多态
}
