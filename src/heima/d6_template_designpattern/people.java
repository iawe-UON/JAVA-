package heima.d6_template_designpattern;

public abstract class people {
    //设计一个抽象方法
    //设计有一个模板方法
    public final void writeheadandtail(){//加上final对模板方法进行保护，防止子类对模板方法进行改写
        System.out.println("head");
        System.out.println(writeMain());
        System.out.println("tail");
    }
    public abstract String writeMain();
}
