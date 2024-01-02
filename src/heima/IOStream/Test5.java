package heima.IOStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Test5 {
    public static void main(String[] args) throws Exception {
        //字符流：文件字符输入流，把磁盘文件中的数据以字符的形式读入到内存中去
        //把每一个字符都当成一个单位，不会出现字节截断的情况，所以肯定不会乱码

        try {
            Reader is = new FileReader("heima/itheima03.txt");
            //读取文本文件内容
            /**
             *  int c;
             *             while((c=is.read())!=-1){
             *                 System.out.print((char) c);//此处注意，要去掉ln，否则会每打印一个字符就换行
             *             }
             * */
            //每次读一个字符，性能肯定较差
            //3.每次读取多个字符：
            char[] buffer = new char[3];//建立字符储存桶
            int l;//记住每次读入了字符的长度
            while((l = is.read(buffer))!=-1){
                System.out.print(new String(buffer, 0, l));
                System.out.print(l);
            }
            //性能是比较不错的

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
