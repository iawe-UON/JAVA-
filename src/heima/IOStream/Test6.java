package heima.IOStream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Test6 {
    public static void main(String[] args) {
        //文件字符输出流：从内存输出到磁盘中去
        try {
            //固定数据的管道
            //FileWriter os = new FileWriter("heima/itheima04.txt");
            //追加数据的管道
            FileWriter os = new FileWriter("heima/itheima04.txt",true);
            //1.方法一，写一个字符出去
            os.write('a');
            //2.方法二，写一个字符串出去
            os.write("asdfAESF");
            //3.写一个字符数组出去
            char[] buffer = {'a','b','b'};
            os.write(buffer);
            //写一个字符数组的一部分出去
            os.write(buffer,0,2);
            os.close();//必须要有一个关闭操作或者刷新操作，否则无法写入数据
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
