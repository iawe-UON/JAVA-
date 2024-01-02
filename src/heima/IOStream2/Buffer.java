package heima.IOStream2;

import java.io.*;

public class Buffer {
    public static void main(String[] args) throws Exception {
        //缓冲流通过对原始流/低级流进行包装，从而提高原始流读写数据的性能
        FileInputStream is = new FileInputStream("heima/itheima04.txt");
        //创建缓冲流管道，后续操作同输入流,可以申明缓冲流
        BufferedInputStream bis = new BufferedInputStream(is,8192*4);
        FileOutputStream os = new FileOutputStream("heima/itheima04.txt");
        BufferedOutputStream bos = new BufferedOutputStream(os);

        //字符缓冲流：同理，提高性能,同时新增功能，按照行读取字符
        Reader isi = new FileReader("heima/itheima03.txt");
        BufferedReader Bisi = new BufferedReader(isi);
        //System.out.println(Bisi.readLine());
        String l;
        while((l=Bisi.readLine())!=null){
            System.out.println(l);
        }
        //同理BufferWriter功能同FileWriter，并且新增换行功能，newline()


    }
}
