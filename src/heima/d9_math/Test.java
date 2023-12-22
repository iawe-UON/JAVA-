package heima.d9_math;

public class Test {
    public static void main(String[] args) {
        //1.了解math类的常用API
        //1.abs
        System.out.println(Math.abs(-12));
        System.out.println(Math.abs(-3.14));
        //2.向上取整
        System.out.println(Math.ceil(4.000001));
        System.out.println(Math.ceil(4.000000));
        //3.向下取整
        System.out.println(Math.floor(3.9999999));
        //4.四舍五入
        System.out.println(Math.round(3.4444));
        System.out.println(Math.round(3.5000001));
        //5.取较大值，取较小值
        System.out.println(Math.max(12, 30));
        System.out.println(Math.min(12, 30));
        //6.取随机数[0.0,1.0)包前不包后
        System.out.println(Math.random());
        //2.了解System常用API
        //System代表程序所在的系统，也是一个工具类
        //1.exit终止当前的JVM

        //System.exit(0);//填0，表示人为终止JVM，一般不要使用

        //currentTimeMillis:获取当前系统的时间，返回的是long类型的毫秒值
        System.out.println(System.currentTimeMillis());//类似于时间戳,做程序的性能分析，注意最后结果要除1000，得到秒数




    }
}
