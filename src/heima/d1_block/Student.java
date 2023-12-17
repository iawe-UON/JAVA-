package heima.d1_block;

public class Student {
    static int number = 80;
    static String name;
    //静态代码块最先运行
    static {
        System.out.println("静态代码块执行了");
        name = "heima";
    }
    //有些是现在代码块里面搞好，将对象赋给类变量，便直接进行初始化
    //每次创建对象，实例代码块先执行，再执行构造器，主要用于初始化对象
    {
        System.out.println("实例代码块执行了");
    }
    public Student(){
        System.out.println("无参数构造器执行了");
    }
    public Student(String name){
        System.out.println("有参数构造器执行了");
    }
    //实例代码块一般用于记录对象创建的日志信息
}
