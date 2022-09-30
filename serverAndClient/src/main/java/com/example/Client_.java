package com.example;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @Author 不要有情绪的  ljy
 * @Date 2022/9/15 9:34
 * @Description:
 */
public class Client_ {
    public static void main(String[] args) throws IOException {
        //Socket连接服务器和端口
        //获得本机的IP和端口号
        InetAddress localHost = InetAddress.getLocalHost();

        //socket 对象插入端口
        Socket socket = new Socket(localHost, 5000);
        System.out.println("服务器已连接......");

        //把数据写入到数据通道
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("hello, server".getBytes());

        //接收服务端数据，并读写
        //IO读取
        System.out.print("读取到数据：  ");
        InputStream inputStream = socket.getInputStream();
        byte[] buf = new byte[1024];  //每次读取1024字节
        int readLen = 0;
        while ((readLen = inputStream.read(buf)) != -1) {
            //从buf的第0个字节读到readLen
            System.out.println(new String(buf,0,readLen));
        }

        System.out.println("客户端已关闭......");

        //关闭流
        socket.close();
        inputStream.close();
        outputStream.close();

    }
}
