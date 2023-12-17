package heima.d2_extends;

public class B extends A{
    //子类可以继承父类的非私有成员
    public void print3(){
        System.out.println(a);//继承了A中的a
    }

}
