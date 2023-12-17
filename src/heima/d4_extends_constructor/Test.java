package heima.d4_extends_constructor;

class F{
    public F(){
        System.out.println("父类的无参数构造器执行了");
    }
}
class A extends F{
    //默认子类会调用父类的无参构造器，但如果父类没有无参构造器，必须在子类构造器加上super(...)，同理也可以用super调用有参构造器
    public A(){
        System.out.println("子类无参数构造器执行了");
    }

    public A(int a){
        System.out.println("子类有参数构造器执行了");
    }
}
public class Test {
    public static void main(String[] args) {
        A a = new A();

        A a1 = new A(1);
    }
}
