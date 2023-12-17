package Interface2;

public class Test {
    public static void main(String[] args) {
    //通过接口来创建对象，可以很方便的切换实现相同接口的类的实现，实现多套方案的切换
    B b1 = new A();
    b1.testb1();
    }
}
class D implements B{

    @Override
    public void testb1() {

    }
}
class A extends student implements B,C{
    //实现多继承，使得创建出的对象有更多的能力和特征
    //实现解耦合，便于多种业务实现，并且显性的知道类可以实现的功能
    @Override
    public void testb1() {

    }

    @Override
    public void testc1() {

    }
}
class student{

}

interface B{
void testb1();
}
interface C{
void testc1();
}
