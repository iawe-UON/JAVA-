package heima.IOStream;

import java.io.FileInputStream;

public class Test2 {
    public static void main(String[] args) throws Exception {
        //一次性读取多个字节
        FileInputStream is  = new FileInputStream(("heima/itheima02.txt"));
        byte[] buffer = new byte[1024];//每次读取多个字节
        int l = is.read(buffer);
        System.out.println(l);
        String s = new String(buffer,0,l);
        System.out.println(s);
        is.close();
        //转字符串中文出不出现乱码取决于能否刚好贴合汉字的三个字节一组的存储方式,主要以上方法还是用于文件内容的拷贝

    }
}
