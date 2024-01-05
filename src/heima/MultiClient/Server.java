package heima.MultiClient;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        //创建服务端通信管道，并且注册指定端口号，调用accept方法进行阻塞接受
        ServerSocket serversocket = new ServerSocket(8888);
        //2.用socket对象接收服务器收到的对象
        Socket socket = serversocket.accept();
        //3.从socket管道中得到一个字节输入流:注意，输入流类型要与客户端一致，要用高级流就都是高级流
        InputStream is = socket.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        //4.千万要记住要与Client一一对应
        while (true) {
            try {
                String rs = dis.readUTF();
                System.out.println(rs);
            } catch (Exception e) {
                System.out.println("客户端挂掉了");
                dis.close();
                socket.close();
                break;
            }
        }
    }
}
