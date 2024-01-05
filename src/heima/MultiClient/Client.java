package heima.MultiClient;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        //实现多发多收
        //1.创建sokcet对象，并请求跟服务器的连接
        Socket socket = new Socket("127.0.0.1",8888);
        //从通信管道中得到一个字节输出流，用来发送数据给服务端程序
        OutputStream os = socket.getOutputStream();
        //可以包装成高级流再进行数据的写入：如数据输出流
        DataOutputStream dos = new DataOutputStream(os);
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("请输入要说的话");
            String msg = sc.nextLine();
            if(msg.equals("exit")){
                System.out.println("退出聊天");
                dos.close();;
                socket.close();
                break;
            }
            //开始写数据出去了
            dos.writeUTF(msg);
            dos.flush();//刷新流
        }
    }
}
