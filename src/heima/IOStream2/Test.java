package heima.IOStream2;

public class Test {
    public static void main(String[] args) {
        //字符流写入文件要注意刷新流和关闭流的问题，否则写入数据无法生效
        //关闭流中包含刷新流操作
        //调用flush(刷新，创建的流可复用)或者close(关闭，创建的流不可以复用)方法
        //字符缓冲区装满后强制刷新流一次，清空缓冲区后在重新读入
        /**
         * 字符流读写文件
         * 字节流复制文件
         * */

    }
}
