package heima.IOStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Test4 {
    public static void main(String[] args) throws Exception {
        //文件字节输出流：建立输出管道将内存中的数据写入到磁盘
        //覆盖管道
        FileOutputStream os = new FileOutputStream(("heima/itheima03.txt"));
        //追加数据管道
        //FileOutputStream os = new FileOutputStream(("heima/itheima03.txt"),true);
        //写字节输出：
        os.write(97);//输出的是一个字节,97代表a
        os.write('b');
        /**
         * os.write('里');//出现乱码，因为默认写入的是一个字节
         *
         * */
        byte[] buffer = "裂开".getBytes();
        os.write(buffer);
        //输出换行符：
        os.write("\r\n".getBytes());
        os.close();
    }
}
