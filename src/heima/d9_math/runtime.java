package heima.d9_math;

public class runtime {
    public static void main(String[] args) throws InterruptedException {
        //Runtime是一个单例类，通过调用getRuntime来获得当前运行时
        //常见方法：
        Runtime r = Runtime.getRuntime();
        //r.exit(0);//终止当前运行的虚拟机，非零状态码表示异常终止
        System.out.println(r.availableProcessors());//获取虚拟机能使用的处理器数量
        System.out.println(r.totalMemory());//返回Java虚拟机中内存的数量，返回的是字节的数量
        System.out.println(r.freeMemory());//返回JVM可用的内存数量，返回的是字节为基本单位
        //r.exec("填写路径")//启动某个exe文件，返回代表该程序的对象,对于已经配好环境变量的程序，可以写入名字直接启动
        //Process p = r.exec("");//得到对象
        Thread.sleep(5000);//暂停5秒钟
        //p.destroy();//终止进程

    }
}
