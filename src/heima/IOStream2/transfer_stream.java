package heima.IOStream2;

import java.io.*;

public class transfer_stream {
    public static void main(String[] args) throws Exception {
        //转换流：字符输入转换流InputStreamReader，字符输出转换流OutputStreamReader，解决乱码问题
        /*代码编码跟文本一致，则不会出现乱码
        * 如果不一致，则会出现乱码
        * */
        //代码编码跟文本编码一致
        try {
            Reader fr = new FileReader("heima/itheima03.txt");
            BufferedReader bfr = new BufferedReader(fr);
            String line;
            while((line = bfr.readLine())!=null){
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        //代码编码为UTF-8，文件编码为GBK，不一致，出现乱码
        try {
            Reader fr = new FileReader("heima/itheima04.txt");
            BufferedReader bfr = new BufferedReader(fr);
            String line;
            while((line = bfr.readLine())!=null){
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            InputStream fr = new FileInputStream("heima/itheima04.txt");
            Reader Tfr = new InputStreamReader(fr,"GBK");
            BufferedReader bfr = new BufferedReader(Tfr);
            String line;
            while((line = bfr.readLine())!=null){
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        //同理，字符输出转换流也是一样的语法


    }
}
