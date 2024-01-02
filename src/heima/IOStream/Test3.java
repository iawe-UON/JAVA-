package heima.IOStream;

import java.io.FileInputStream;

public class Test3 {
    public static void main(String[] args) throws Exception {
        //1、一次读取全部字节方法：
        /**
         *1：使用较大的大字节数组，但是有较大局限性，文件字节数可能好几个GB
         *2：使用readAllbytes方法，直接返回一个字节数组
         * */
        //readAllBytes示例
        FileInputStream is = new FileInputStream(("heima/itheima02.txt"));
        byte[] buffer = is.readAllBytes();
        System.out.println(new String(buffer));
        //文件过大会导致内存溢出，报错，并且该方法可以处理汉字，不会导致乱码
        //读写文本文件，更适合用字符流，字节流一般用来处理文件的拷贝或者复制

    }
}
