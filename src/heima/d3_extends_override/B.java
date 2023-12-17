package heima.d3_extends_override;

public class B extends A{
    //override
    //私有方法，类方法（静态方法）不可以被重写
    //“申明不变，重新实现”
    @Override//加注解
    public void print1(){
        System.out.println("6666666");
    }
    @Override
    public void print2(int a,int b){
        System.out.println(a * b);
    }
    //子类重写object的toString方法，便于返回对象的内容

}
