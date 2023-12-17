package heima.d6_template_designpattern;
//设计模式：模板方法设计模式，解决方法中存在重复代码的问题，一般使用抽象类来进行实现
public class Test {
    public static void main(String[] args) {
        //场景：学生，老师，都要写一篇作文：我的爸爸
        //第一段和最后一段都是一样的，只有中间不一样，用模板设计模式进行生成
        //1.模板方法设计模式：
        Teacher t1 = new Teacher();
        t1.writeheadandtail();

        Student s1 = new Student();
        s1.writeheadandtail();
    }
}
