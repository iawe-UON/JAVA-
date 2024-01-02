package heima.IOStream;

import java.io.*;

public class Test {
    public static void main(String[] args) throws Exception {
       //1、创建文件字节输入流管道
        FileInputStream is = new FileInputStream(new File("heima/itheima01.txt"));
        //2、读取文件的字节数据
        int b1 = is.read();
        System.out.println(b1);

        int b2 = is.read();
        System.out.println(b2);

        System.out.println((char) b1);
        System.out.println((char) b2);
        //3、文件如果没有数据可读，返回-1,并且停止读取
        //4、可以用循环读取数据，但是性能很差,读取汉字输出会乱码，并且无法改变



    }
}
